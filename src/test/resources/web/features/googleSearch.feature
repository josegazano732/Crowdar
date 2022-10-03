@Smoke
Feature: As a potential client i need to search in google to find a web site

  Background:
    Given The client is in google page

  Scenario Outline: The client search
    When The client search for word <word>
    Then The client verify that results are shown properly

    Examples:
      |word|
      |Juan Manuel Gazano|
      |Cristina Elizabeth Gazano|
      |Hugo fabian Gazano|
      |Testing|


  #Scenario: The client search by "A utomation"
   # When The client search for word Automation
    # Then The client verify that results are shown properly


   # Scenario: The client search by "Docker"
   # When The client search for word Docker
   # Then The client verify that results are shown properly


  #Scenario: The client search by "Lippia"
   # When The client search for word Lippia
   # Then The client verify that results are shown properly

