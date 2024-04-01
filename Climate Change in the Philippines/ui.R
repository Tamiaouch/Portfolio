data <- read.csv("https://raw.githubusercontent.com/owid/co2-data/master/owid-co2-data.csv", stringsAsFactors = FALSE)
library(plotly)
page_one <- tabPanel(
  #static header
  "Main Page",
  h1("Co2 Emissions in the Philippines", align = "center"),
  
  #Description of the data
  h2("Who collected the data?", align = "left"),
  textOutput("description"),
  h2("How was the data collected?", align = "left"),
  textOutput("description2"),
  h2("Why was the data collected?", align = "left"),
  textOutput("description3"),
  h2("What problems of limitations come with this data", align = "left"),
  textOutput("description4"),
  
  #five important values
  h1("Five Important Values", align = "center"),
  h3("What is the average increase of co2 each year from 1968 - 2018 in the Philippines?", align = "left"),
  textOutput("value1"),
  h3("Which year had the highest / lowest co2 growth percentage?", align = "left"),
  textOutput("value2"),
  h3("Which year had the highest land use change co2 percentage?", align = "left"),
  textOutput("value3"),
  
  #conclusion/summary
  h1("Conclusion", align = "center"),
  textOutput("conclusion"),
  
  
)
page_two <- tabPanel(
  "Interactive Map of Co2 Data",
  sidebarLayout(
    sidebarPanel(
      selectInput(
        inputId = "analysis_var",
        label = "Choose Co2 Variable",
        choices = c("co2_growth_prct", "land_use_change_co2"),
        selected = "co2_growth_prct"),
    sliderInput(
                inputId = "slider",
                label = "Year range:",
                min = 1968, 
                max = 2018,
                value = c(1968, 2018))
    ),
    
    # Display the map and table in the main panel
    mainPanel(
      plotlyOutput("interactive")
    )
)
)

my_ui <- navbarPage(
  "Tamia Ouch A4",
  page_one,
  page_two
  )