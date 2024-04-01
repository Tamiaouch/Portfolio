# A2: U.S. COVID Trends

## Overview
In many ways, we have come to understand the gravity and trends in the COVID-19 pandemic through data. Regardless of media source, people are consuming more epidemiological information than ever, primarily through reported figures, charts, and maps.

This assignment is your opportunity to work directly with the same data used by the [New York Times](https://github.com/nytimes/covid-19-data/). While the analysis is guided through a series of questions, it is your opportunity to use programming skills to ask more detailed questions about the pandemic.

## Getting Started
You should start this assignment by opening up the `analysis.R` script. The script will guide you through an initial analysis of the data.

* **Coding prompts.** Complete the coding prompts in `analysis.R`.

* **Reflection prompts.** Throughout `analysis.R`, there are prompts labeled `"Reflection"`. Please write at least 1-3 sentences for each of these prompts below in this `README.md` file. As appropriate, provide evidence, give justification for your opinions, or genuinely reflect on your views. Please strive for concise, clear, and interesting writing.

## Reflection 1
Before actually calculating the total number of COVID cases and deaths, record your guesses for the following questions.

Guess: How many total COVID cases do you think there have been in the U.S.? 

I think the total amoutn of covid cases in the US are 1,000,000

Guess: How many total COVID-related deaths do you think there have been in the U.S.?

I think that there are a total of 500,000 covid related deaths in the US

Guess: Which state do you think has the highest number of COVID cases, and which state do you think has the lowest?

I think the highest number of covid cases occured in Flordia, and the least is in Alaska

## Reflection 2
Did the number of COVID cases and deaths surprise you? Why or why not? What about the states with the highest and lowest number of cases? How did your guesses line up with the actual results? Answer in at least 1-3 sentences

The number of covid cases and deaths did surprise me, I thought I would be within 100,000 away from the true answer but the case number was so high. The death to case ratio was also way lower than I thought. My family wasn't very strict with covid policies so I wasn't familiar with just how large scaled the issue was. When I made my estimates about which states had the highest and lowest I had the right idea in mind, that it would be based somewhat on population. I thought that flordia had a lot of people, without considering how packed california is. I also tried to find a low populated state so I said Alaska, without even considering the islands like Samoa. My guesses did not aline with any of the results

## Reflection 3
Which county has the highest number of cases in the state of Washington, and does it surprise you? Why or why not? (You may need to google this county to learn about it) Answer at least in 1-3 sentences

King county has the highest number of cases and it doesn't surprise me because king county is the most populated. It seems that there is a trend on how many cases there are and how highly populated the area is. 

## Reflection 4
Why are there so many observations (counties) in the variable `lowest_deaths_in_each_state`? That is, wouldn't you expect the number to be around 50? Why is the number greater than 50? Answer in at least 1-3 sentences

The number is greater than 50 because puerto ricos counties had an error. My only assumption is that puerto rico had too many counties with the same number, I tried to look at what "-inf" meant online but found no results. 

## Reflection 5
What do you think about the number and scale of the inconsistencies in the data? Does the fact that there are inconsistencies mean that people should not use this data? Why or why not? Answer in at least 1-3 sentences

I think that the number and scale of inconsistencies is not large enough to consider the data unusable. The differences between the two counts were not large, this meant that the counties count was only off by a few. 


## Reflection 6
Why were you interested in this particular question? Were you able to answer your question with code? What did you learn? Answer in at least 1-3 sentences

I was interested in this particular question because as a somewhat liberal, my friends and I always assumed that red states have more covid cases because they don't believe in mask mandation. In the 2020 election, virginia was a blue state and north carolina was a red state. Those who states have similar population so the only difference would be their political party. 

## Reflection 7
What, if anything, made you curious about this COVID analysis? What, if anything, surprised you? What might you do the same or differently on your next data wrangling project? Answer in at least 1-3 sentences

Next time I want to figure out how to search the data for errors before I preceed so that next time I dont find out halfway through my project. What surprised me is that north carolina had more covid cases, I wanted to believe that regardless of their political beliefs, they were safe from covid. I believe public safety should be a priority and its upsetting that they had more deaths and it can correlate to their beliefs.