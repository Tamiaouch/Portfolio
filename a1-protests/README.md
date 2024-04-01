# Assignment 1: Protests

During the past few years in the United States, there has been a surge of protests in support of the Black Lives Matter movement, women's rights, trans rights, immigration reform, gun control, the environment, and many other social and political issues.

In this assignment, you will work with data from [CountLove](https://countlove.org/), a group that collects data about protests from across the United States, including information about the purpose of the protests, the location of the protests, as well as how many people attended the protests. This data has often been [cited by the *New York Times*](https://www.nytimes.com/2020/08/28/us/black-lives-matter-protest.html), among other major outlets.

Through this assignment, you will be able to answer questions including:
- What were the most attended and least attended protests in the US in the last 5 years?
- How many protests occurred in Washington state?
- How did the number of protests in 2019 compare to 2020, and why?
- Why are people protesting in the US? What are the biggest motivators?


This assignment is divided into 2 parts. You will complete your coding work in the `analysis.R` file, and you will write short answer responses related to critical analysis and reflection of the data in this `README.md` file. Before getting started on your coding work, you should complete the section **"Critical Analysis & Reflection: Before You Code"** below.

When you are finished with the assignment, be sure to push all changes to your GitHub repository and then submit the link on Canvas.

## Before You Code: Critical Analysis & Reflection

Before diving into this (or any) dataset, it's important to know where the data came from, and it's important to have or to seek out _domain familiarity_ — in other words, knowledge about the subject/topic of the dataset. (We don't want to be "strangers in the dataset," as Catherine D'Ignazio and Lauren Klein describe it.)

To get more familiar, we are going to begin by doing some background reading.

- First, please read [this FAQ](https://countlove.org/faq.html) from the CountLove website and the opening of [this blog post](https://www.tommyleung.com/countLove/index.htm). Based on the information in these pieces, why did the creators start collecting the CountLove data? Please answer in 2-3 sentences (3 points)

The creators started collecting the count love data because they understood how important it is that voters are aware of the current events. Protests are a way to communicate to our elected officials but going through articles is tedious. They wanted to keep a factual record and make compelling cases for the country. 

- Next, we would like you to read this [*New York Times* piece, which uses CountLove data](https://www.nytimes.com/interactive/2020/06/13/us/george-floyd-protests-cities-photos.html) (here's a [Google Doc version for anyone who gets paywalled](https://docs.google.com/document/d/1sdjFsA5csYuH4plNEEk7WXT77K5h5ZuyW05CBwYdk6A/edit?usp=sharing)), and which describes the Black Lives Matter protests that occurred in the summer of 2020. Please summarize the main point or argument of this article in 2-3 sentences (3 points)

The main point of this article is to spread awareness about how when communities find something important the power that they hold when they come together is contagious. There is without a doubt no question that the treatment of african americans have been wrongly treated in the US for all of history. When we as a community finally got the pride to fight for what we believe in, it spread throughout the US in a matter of weeks. These protests flooded the news and opened the question “when will this end”, a question that the black community has wondered for years but the US only asked when it came to the protests and outcry. The power we hold as a community is strong, and when we work together it is possible to change the system we do not accept. 

Next, we're going to reflect about who collected this data, and what's actually inside it.

- Who collected and shared the CountLove data, and what do they do for a living? Please answer in 1-2 sentences(2 points)

The data was collected by Tommy Leung and Nathan Perkins, they are engineers and scientists. They do protest work and commonly write for other venues. 

- As Klein and D'Ignazio remind us, when it comes to data, "what gets counted counts." What types of demonstrations does CountLove include in their data, and what types do they exclude? (3 points)

Count love includes public displays that aren’t a part of “regular business”. They exclude awareness events, commemorative celebrations, fundraising events, historic reenactments, town halls and political rallies. 

- How and where does CountLove get their data about the protests? Please answer in 2-3 sentences (2 points)

Count love gets their data from local newspapers and television sites. They’ve written a more thorough overview of their data which covers protests events from January 2017 and January 2021. They search for the words “March”, “rally”, “protest” and demonstration. 

- How does CountLove make their estimates about the number of people who attended a protest? What potential problems might arise from this method of estimation? Please answer in 3-4 sentences (4 points)

They make their estimates from news articles, they interpret a dozen as 10 and dozens as 20, 100s as a hundred and so forth. If an attendance count is not in the news article they leave the count empty. If the report count is ambiguous they use the most conservative estimate. The problem that can arise from this is that using the most conservative estimate means that very large attended protests can be undermined in the data because they believed that number was “ambiguous” being ambiguous does not necessarily mean the data is untrue, and therefore this can be an issue. 


## While You Code: Critical Analysis & Reflection

- Reflection 1: Why do you think the mean is higher than the median? Which metric would you use in a report about this data, and why? Please answer in 2-3 sentences (2 points)

I think that the mean is higher than the median because some protests had especially high attendance. This means that the mean would be larger but since there aren't many high attended protests the median stayed low. This means there were more low attended protests than high attended protests. I would use a histogram to report this data because it would show the audience that there weren't many high attended protests


- Reflection 2: Before actually calculating the number of protests that occurred in 2018, 2019, 2020, record your guesses for the following questions. (1 point)

  Guess: Do you think there were more protests in 2019 than in 2018? Why or why not? Please answer in 1 or 2 sentences
I think that there were more protests in 2019 because more major events occurred. For example that was the beginning of covid, and people were looking into donald trump's impeachment.


  Guess: Do you think there were more protests in 2020 than in 2019? Why or why not? Please answer in 1 or 2 sentences
I think there were definitely more protests in 2020 than 2019 because that's when the mask mandation started and George Floyd passed away in may of 2020.Both of these events made protests more common.

- Reflection 3: Does the change in the number of protests from 2018 to 2019 to 2020 surprise you? Why or why not? What do you think explains the fluctuation? Please answer in 1 or 2 sentences (2 points)
The change does surprise me because I don’t think I paid enough attention to current events to understand why 2018 had more protests than 2019.

- Reflection 4: What is the first and fourth most frequent category of protest? Do these frequencies align with your sense of the major protest movements in the U.S. in the last few years? Why or why not? (3 points)
The most frequent category was racial injustice, and the 4th most frequent was immigration. This didn’t align with what I thought previously because I totally forgot about immigration laws during trump's election. I think I held more importance on remember racial injustice because I physically went to a protest for the BLM movement so it was sort of my issue of focus in 2020

## After You Code: Critical Analysis & Reflection

In the second chapter of *Data Feminism*, Klein and D'Ignazio describe 4 ways that data scientists can challenge power and take action:
> Taking action can itself take many forms, and in this chapter we offer four starting points:  
> (1) Collect: Compiling counterdata—in the face of missing data or institutional neglect—offers a powerful starting point as we see in the example of the DGEI, or in María Salguero’s femicide maps discussed in chapter 1.  
> (2) Analyze: Challenging power often requires demonstrating inequitable outcomes across groups, and new computational methods are being developed to audit opaque algorithms and hold institutions accountable.  
> (3) Imagine: We cannot only focus on inequitable outcomes, because then we will never get to the root cause of injustice. In order to truly dismantle power, we have to imagine our end point not as “fairness,” but as co-liberation.  
> (4) Teach: The identities of data scientists matter, so how might we engage and empower newcomers to the field in order to shift the demographics and cultivate the next generation of data feminists?  

- How does the CountLove project embody one or more of these 4 forms of challenging power? Please answer in at least 3-4 sentences (3 points)
Countlove embodies the first form of action which is collect and compiling counterdata. Countlove compiled all of the protests so that were able to see a representation of the injustices that are defined by society. They mention on their website that they collected this data in order to make it easier for people to consider these issues during election time
- What is the most interesting or surprising thing you learned from this analysis? Please answer in at least 2-3 sentences (2 points)
I was most surprised by the fact that healthcare was so low. Healthcare is a universal issue, while racial injustice is fought for one community, healthcare is something all of society should have access too. Especially with Covid-19 and the overworking of essential workers I would assume more protests would be fighting for healthcare. I learned that our society prioritizes equality and equity for all races, which is why immigration and racial injustice were so high.

- What is a kind of analysis that you would like to do or that would be interesting to do with the CountLove data that you don't have the time or skills to accomplish at this moment? Please answer in at least 2-3 sentences (2 points)
I would like to look at the demographics that are attending these protests. Typically we assume those fighting for more gun rights are republican, and associate that with a specified race. Also in terms of racial injustice I want to see the amount of support shown by ethnicities other than ones that belong to the community fighting for rights. It’s interesting to see who supports what claims, to either support or break stereotypes. 

