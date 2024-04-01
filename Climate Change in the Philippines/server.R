# Server
my_server <- function(input, output) { 
  library(dplyr)
  library(plotly)
  library(tidyverse)
  library(ggplot2)
  data <- read.csv("https://raw.githubusercontent.com/owid/co2-data/master/owid-co2-data.csv")
  philippines_data <- data %>% filter(country == "Philippines")%>% filter(year >= 1968 & year <= 2018) %>% select(year, co2_growth_prct, land_use_change_co2)
  
  #data analysis
  output$description <- renderText({ 
    "This data was collected by Our World in Data and published by Hannah Ritchie, Max Roser, and Pablo Rosado."
  })
  
  output$description2 <- renderText({ 
    "It was collected by thousands of researchers, and compiled into a format that makes it accessible without paywall or jargon."
  })
  
  output$description3 <- renderText({ 
    "This data was collected to publicate large global problems, and show that it is possible to change the world. Our World in Data states If you want to contribute to a better future you need to know the problems the world faces. To understand these problems the daily news is not enough. The news media focuses on events and therefore largely fails to report the two aspects that Our World in Data focuses on: the large problems that continue to confront us for centuries or much longer and the long-lasting, forceful changes that gradually reshape our world."
  })
  
  output$description4 <- renderText({ 
    "A problem that comes with this data is that there are many NA values, which categories vary country to country. This means that we would have to exclude those values or variables depending on which years we discuss. Another problem is that the variables used are not well known, we would have to provide what each variable means and its importance."
  })
  
  #5 values
  output$value1 <- renderText({ 
    "3.96 is the average Co2 increase per year"
  })
  
  output$value2 <- renderText({ 
    "1973 had the highest Co2 growth and 1984 had the lowest"
  })
  
  output$value3 <- renderText({ 
    "1976 had the highest land use Co2"
  })
  
  #conclusion
  output$conclusion <- renderText({ 
    "The visualization shows that the year with the most co2 change from land use is 1976. It also shows that the 
    year with the most co2 change without land change is 1976. This information is important
    because it can tell us what years to study. Studying these years can tell us what patterns to avoid.
    For example, if in 1976 we expanded our industrial industry then we can tie that to the increase
    in co2 levels, and not expand our industrial industry again in the future"
  })

  #second page interactive visualization
  
  output$interactive <- renderPlotly({
    low_yr <- input$slider[1]
    high_yr <- input$slider[2]
    pivot_df <- philippines_data %>% 
      pivot_longer(!c(year),
                   names_to = "climate_category",
                   values_to = "growth")
    pivot_df2 <- pivot_df %>% filter(climate_category == input$analysis_var) %>% filter(year >= low_yr & year <= high_yr)
    Co2_trends <- ggplot(data = pivot_df2) +
      geom_point(mapping = aes(
        x = year,
        y = growth)) +
      geom_line(mapping = aes(
        x = year,
        y = growth)) +
      labs(title = "Co2 Growth Percentage Trends", x = "Year", y = "Percent Change")
    ggplotly(Co2_trends)
  })
  
  
  
}