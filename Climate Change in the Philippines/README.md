# Assignment 4: Climate Change

Climate change is a pressing issue around the globe that has differential impacts on individuals based on where they live and their financial status. In this assignment, you will build an interactive Shiny application exploring CO2 emissions data compiled by Our World In Data. You will need to create all of the necessary files for your work (e.g., `app.R`, `ui.R`, `server.R`).

Shiny App: [https://tamiaouch.shinyapps.io/a4-climate-change-Tamiaouch/?_ga=2.49256419.431096818.1677722087-172409258.1677176366]

## Data

The data, which you will load from this [GitHub repository](https://github.com/owid/co2-data/) (specifically the [owid-co2-data.csv](https://github.com/owid/co2-data/) file). A few hints on working with it:

- Read the documentation: See the GitHub Repository to view the "Codebook" that explains the meaning of each variable. You'll need to understand what each variable represents, so read carefully!
- Beware of missing values: You don't need to worry about "imputing" these, but when choosing what to visualize, you will want to focus on a particular location and/or year that has sufficient data (note, this varies across the variables)

## Assignment structure

For this assignment, you will create a multi-page interactive Shiny application that allows users to explore data about CO2 emissions, which must include:

- An introductory page (tab) that introduces the topic, describes the data, and provides some summary values from the dataset
- An interactive visualization page (tab) where users can control a visualization using at least two Shiny widgets

## Introduction + Summary + Data

To introduce your small project, you should describe the features that you've chosen to analyze in your Shiny app and why.

Then, in at least 200 words, describe the dataset that you're analyzing, and be sure to answer the following questions: Who collected the data? How was the data collected or generated? Why was the data collected? What are possible limitations or problems with this data? 

This data was collected by "Our World in Data" and published by Hannah Ritchie, Max Roser, and Pablo Rosado. This data was funded through grants and reader donations. It was collected by thousands of researchers, and compiled into a format that makes it accessible without paywall or jargon. This data was collected to publicate large global problems, and show that it is possible to change the world. Our World in Data states "If you want to contribute to a better future you need to know the problems the world faces. To understand these problems the daily news is not enough. The news media focuses on events and therefore largely fails to report the two aspects that Our World in Data focuses on: the large problems that continue to confront us for centuries or much longer and the long-lasting, forceful changes that gradually reshape our world." A problem that comes with this data is that there are many NA values, which categories vary country to country. This means that we would have to exclude those values or variables depending on which years we discuss. Another problem is that the variables used are not well known, we would have to provide what each variable means and its importance. 

Then, you will share at least 5 relevant values of interest. These will likely be calculated using your DPLYR skills, answering questions such as: 

- What is the average increase of co2 growth each year from 1968 - 2018 in the Philippines?
3.96
- Which year had the highest / lowest co2 growth percentage?
1973 had the highest and 1984 the lowest

- Which year had the highest land use change co2 percentage? 
1976 had the highest land use co2


Feel free to calculate and report values that you find relevant. Importantly, you should calculate these values in your app_server.R file, and display them in your user interface using the appropriate method. 

Finally, you should write 2-5 sentences about the conclusions or insights that you were able to draw from your visualization.
The visualization shows that the year with the most co2 change from land use is 1976. It also shows that the year with the most co2 change without land change is 1976. This information is important because it can tell us what years to study. Studying these years can tell us what patterns to avoid. For example, if in 1976 we expanded our industrial industry then we can tie that to the increase in co2 levels, and not expand our industrial industry again in the future
  

## Interactive Visualization Page

On your second page (tab), you will create an interactive visualization that is controlled by two or more Shiny widgets. A few requirements for this page:

- The chart must be interactive (e.g., display information when you hover over visual marks), so you will need to use a library such as Plotly or Bokeh (or another interactive package of your choice)
- The chart must have clear axis labels, title, and legend (depending on the chart type)
- At least one of the widgets must change what data is displayed in the chart (e.g., selecting a variable to display in the chart). The other widget can control something like the colors used in the chart, or allow you to select something like the year being displayed
- Below the chart, you need to include a description of why you included the chart, and what patterns emerged as you explored it

Once you have completed your work, make sure to host your application on https://www.shinyapps.io/.
