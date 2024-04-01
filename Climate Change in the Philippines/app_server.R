
library(plotly)
library(dplyr)
library(ggplot2)
library(tidyverse)

data <- read.csv("https://raw.githubusercontent.com/owid/co2-data/master/owid-co2-data.csv", stringsAsFactors = FALSE)
philippines_data <- data %>% filter(country == "Philippines") %>% filter(year > "1968") %>% filter(year < "2018") %>% select(year, co2_growth_prct, land_use_change_co2)
Co2_trends <- ggplot(data = philippines_data) +
  geom_point(mapping = aes(
    x = year,
    y = co2_growth_prct)) +
  geom_line(mapping = aes(
    x = year,
    y = co2_growth_prct)) +
  labs(title = "Co2 Growth Percentage Trends", x = "Year", y = "Percent Change")
ggplotly(Co2_trends)

avg_inc <- philippines_data %>% summarize(avg_inc = mean(co2_growth_prct)) %>% pull(avg_inc)
highest_inc <- philippines_data %>% filter(co2_growth_prct == max(co2_growth_prct)) %>% pull(year)
lowest_inc <- philippines_data %>% filter(co2_growth_prct == min(co2_growth_prct)) %>% pull(year)
highest_land <- philippines_data %>% filter(land_use_change_co2 == max(land_use_change_co2)) %>% pull(year)

highest_inc2 <- philippines_data %>% filter(co2_growth_prct == max(co2_growth_prct)) %>% pull(co2_growth_prct)
highest_land2 <- philippines_data %>% filter(land_use_change_co2 == max(land_use_change_co2)) %>% pull(land_use_change_co2)
whats_higher <- 
  if(highest_land2 > highest_inc2){
    print("Land use is higher")
  }else{
    print("Co2 without land use is higher")
  }
pivot_df <- philippines_data %>% 
  pivot_longer(!c(year), # Columns to ignore
               names_to = "climate_category",
               values_to = "growth")
pivot_df2 <- pivot_df2 %>% filter(climate_category == input$analysis_var)
philippines_data2 <- data %>% filter(year >= low_yr & year <= high_yr) %>% select(year, co2_growth_prct, land_use_change_co2)

output$interactive <- renderPlotly({
  low_yr <- input$slider[1]
  high_yr <- input$slider[2]
  input_data <- philippines_data %>% filter(year >= low_yr & year <= high_yr) %>% select(year, co2_growth_prct, land_use_change_co2)
  Co2_trends <- ggplot(data = input_data) +
    geom_point(mapping = aes(
      x = year,
      y = co2_growth_prct)) +
    geom_line(mapping = aes(
      x = year,
      y = co2_growth_prct)) +
    labs(title = "Co2 Growth Percentage Trends", x = "Year", y = "Percent Change")
  ggplotly(Co2_trends)
})