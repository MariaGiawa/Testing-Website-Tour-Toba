*** Settings ***
Library    SeleniumLibrary
Library    DateTime

*** Test Case ***
RentalTes01
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]   Medan
    Input Text    //*[@id="pickingupdate"]    06/5/2023
    Input Text    //*[@id="pickinguphour"]   11.00AM
    Input Text    //*[@id="pickingoff"]    Balige
    Input Text    //*[@id="pickingoffdate"]    06/12/2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 

RentalTes02
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    06/02/2023
    Input Text    xpath=//*[@id="picking-uphour"]    13.00PM
    Input Text    //*[@id="pickingoff"]    Parapat
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes03
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/02/2023
    Input Text    //*[@id="pickinguphour"]   13.00PM
    Input Text    //*[@id="pickingoff"]    Parapat
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes04
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]   ${empty}
    Input Text    //*[@id="pickingupdate"]    06/02/2023
    Input Text    //*[@id="pickinguphour"]   13.00PM
    Input Text    //*[@id="pickingoff"]    Parapat
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes05
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]   Sigumpar 
    Input Text    //*[@id="pickingupdate"]    06//2023
    Input Text    //*[@id="pickinguphour"]    15.00PM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    11.00AM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes06
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]   Porsea 
    Input Text    //*[@id="pickingupdate"]    ${empty}
    Input Text    //*[@id="pickinguphour"]    14.25PM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13.15 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes07
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]   Porsea 
    Input Text    //*[@id="pickingupdate"]    06/02/2023
    Input Text    //*[@id="pickinguphour"]   14.
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13.15 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 

RentalTes08
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]   Porsea 
    Input Text    //*[@id="pickingupdate"]    06/02/2023
    Input Text    //*[@id="pickinguphour"]    ${empty}
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13.15 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes9
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    05/30/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    05/31/2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element    //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 

RentalTes10
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    05/30/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    05/31/2023
    Input Text    //*[@id="pickingoffdate"]    05/31/2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 


RentalTes11
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    05/30/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Balige
    Input Text    //*[@id="pickingoffdate"]    2023
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    

RentalTes12
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    05/30/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    ${empty}
    Input Text    //*[@id="pickingoffhour"]    13.00 PM    
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    

RentalTes13
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    06/03/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    13  
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 


RentalTes14
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    06/03/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    ${empty} 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    

RentalTes15
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    ${empty} 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes16
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    ${empty} 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes17
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    14.24PM 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes18
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    14.24PM 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes19
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    14.24PM 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes20
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/05/2023
    Input Text    //*[@id="pickingoffhour"]    14.24PM 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    

RentalTes21
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/
    Input Text    //*[@id="pickingoffhour"]    14.24PM 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 

RentalTes22
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/
    Input Text    //*[@id="pickingoffhour"]    14.24PM 
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes23
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/
    Input Text    //*[@id="pickingoffhour"]    14.24
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
    
RentalTes24
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed 
  
RentalTes25
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Log    Test Completed
    

RentalTest 26
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/04/2023
    Input Text    //*[@id="pickinguphour"]    11.00AM
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 27
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    06/
    Input Text    //*[@id="pickinguphour"]    11.00
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 28
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    00
    Input Text    //*[@id="pickinguphour"]    00
    Input Text    //*[@id="pickingoff"]    Siantar
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 29
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    00/00/00
    Input Text    //*[@id="pickinguphour"]    12.35
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 30
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    12.35
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 31
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    12.35
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 32
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    12.35
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 35
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    08/05/2023
    Input Text    //*[@id="pickinguphour"]    12
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 36
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    08/05/2023
    Input Text    //*[@id="pickinguphour"]    00
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    100
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 37
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    08/05/2023
    Input Text    //*[@id="pickinguphour"]    -
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/10/2023
    Input Text    //*[@id="pickingoffhour"]    100
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 38
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    08/05/2023
    Input Text    //*[@id="pickinguphour"]    11.24PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06-00-0000
    Input Text    //*[@id="pickingoffhour"]    100
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 39
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    08/05/2023
    Input Text    //*[@id="pickinguphour"]    11.24PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    --00-0000
    Input Text    //*[@id="pickingoffhour"]    100
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 41
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    08/05/2023
    Input Text    //*[@id="pickinguphour"]    11.24PM
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    11 Juni 2023
    Input Text    //*[@id="pickingoffhour"]    00.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 45
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    --
    Input Text    //*[@id="pickinguphour"]    00.
    Input Text    //*[@id="pickingoff"]    Porsea
    Input Text    //*[@id="pickingoffdate"]    06/11/2023
    Input Text    //*[@id="pickingoffhour"]    14.20PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 46
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    12.00
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/11/2023
    Input Text    //*[@id="pickingoffhour"]    14.20PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 47
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    12.00
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    06/11/2023
    Input Text    //*[@id="pickingoffhour"]    14.20PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 48
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    12.00
    Input Text    //*[@id="pickingoff"]    Lguboti
    Input Text    //*[@id="pickingoffdate"]    11/2023
    Input Text    //*[@id="pickingoffhour"]    14.20PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 49
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    12.00
    Input Text    //*[@id="pickingoff"]    Lguboti
    Input Text    //*[@id="pickingoffdate"]    11/2023
    Input Text    //*[@id="pickingoffhour"]    14.20PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 50
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    12.00
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    00.00.00
    Input Text    //*[@id="pickingoffhour"]    14.20PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 51
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    12.00.PM
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    11/09/2023
    Input Text    //*[@id="pickingoffhour"]    14.
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 52
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    00000
    Input Text    //*[@id="pickinguphour"]    13.00.PM
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    00.00.0011/09/2023
    Input Text    //*[@id="pickingoffhour"]    14.PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 53
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    12/09/2023
    Input Text    //*[@id="pickinguphour"]    13.0
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    11/09/2023
    Input Text    //*[@id="pickingoffhour"]    14.PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 54
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    00.PM
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    00.00.0011/09/2023
    Input Text    //*[@id="pickingoffhour"]    .PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 55
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    00.PM
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    11/09/2023
    Input Text    //*[@id="pickingoffhour"]    .PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 56
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    00.
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    /09/2023
    Input Text    //*[@id="pickingoffhour"]    .PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 57
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    00.
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    11/09/2023
    Input Text    //*[@id="pickingoffhour"]    .PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 58
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    01.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    07//
    Input Text    //*[@id="pickingoffhour"]    15.00PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 61
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    01.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    07/07/2023
    Input Text    //*[@id="pickingoffhour"]    15
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 62
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    01.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    07/07/2023
    Input Text    //*[@id="pickingoffhour"]    00
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 63
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Balige
    Input Text    //*[@id="pickingupdate"]    ------
    Input Text    //*[@id="pickinguphour"]    01.M
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    08/09/2023
    Input Text    //*[@id="pickingoffhour"]    14.25PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 64
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    01.00AM
    Input Text    //*[@id="pickingoff"]    Tarutung
    Input Text    //*[@id="pickingoffdate"]    07/0
    Input Text    //*[@id="pickingoffhour"]    13.30 PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 67
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Sigumpar
    Input Text    //*[@id="pickingupdate"]    06/07/2023
    Input Text    //*[@id="pickinguphour"]    01.00AM
    Input Text    //*[@id="pickingoff"]    Tarutung
    Input Text    //*[@id="pickingoffdate"]    07/0
    Input Text    //*[@id="pickingoffhour"]    13.30 PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 68
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Sigumpar
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    .
    Input Text    //*[@id="pickingoff"]    Tarutung
    Input Text    //*[@id="pickingoffdate"]    07/08/2023
    Input Text    //*[@id="pickingoffhour"]    0
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 69
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Sigumpar
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    .
    Input Text    //*[@id="pickingoff"]    Tarutung
    Input Text    //*[@id="pickingoffdate"]    07/08/2023
    Input Text    //*[@id="pickingoffhour"]    0
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 70
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Sigumpar
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    .
    Input Text    //*[@id="pickingoff"]    Tarutung
    Input Text    //*[@id="pickingoffdate"]    07/08/2023
    Input Text    //*[@id="pickingoffhour"]    0
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 71
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    12.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    00/00/0000
    Input Text    //*[@id="pickingoffhour"]    18.25PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 72
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    -
    Input Text    //*[@id="pickinguphour"]    12.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    00/00/0000
    Input Text    //*[@id="pickingoffhour"]    18.25PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 73
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    05
    Input Text    //*[@id="pickinguphour"]    12.00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    05/08/2023
    Input Text    //*[@id="pickingoffhour"]    10PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 74
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    00
    Input Text    //*[@id="pickinguphour"]    12.00AM
    Input Text    //*[@id="pickingoff"]    Tarutung
    Input Text    //*[@id="pickingoffdate"]    0/0/2023
    Input Text    //*[@id="pickingoffhour"]    10PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 75
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    06/08/2023
    Input Text    //*[@id="pickinguphour"]    00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    0/0/2023
    Input Text    //*[@id="pickingoffhour"]    10.50PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 76
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Laguboti
    Input Text    //*[@id="pickingupdate"]    06/08/2023
    Input Text    //*[@id="pickinguphour"]    00AM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/01/2023
    Input Text    //*[@id="pickingoffhour"]    10
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 77
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    2023
    Input Text    //*[@id="pickinguphour"]    00PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    12/08/2023
    Input Text    //*[@id="pickingoffhour"]    10.00AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 78
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    2023
    Input Text    //*[@id="pickinguphour"]    00PM
    Input Text    //*[@id="pickingoff"]    Siborongborong
    Input Text    //*[@id="pickingoffdate"]    01/001/2023
    Input Text    //*[@id="pickingoffhour"]    10.00AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    

RentalTest 79
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    2023
    Input Text    //*[@id="pickinguphour"]    00PM
    Input Text    //*[@id="pickingoff"]    Siborongborong
    Input Text    //*[@id="pickingoffdate"]    09/01/2023
    Input Text    //*[@id="pickingoffhour"]    AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 80
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    2023
    Input Text    //*[@id="pickinguphour"]    00PM
    Input Text    //*[@id="pickingoff"]    Siborongborong
    Input Text    //*[@id="pickingoffdate"]    09/01/2023
    Input Text    //*[@id="pickingoffhour"]    AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 81
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    09/072023
    Input Text    //*[@id="pickinguphour"]    00PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    00
    Input Text    //*[@id="pickingoffhour"]    15.45AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 82
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    09/072023
    Input Text    //*[@id="pickinguphour"]    00PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    45AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 83
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    09/072023
    Input Text    //*[@id="pickinguphour"]    16.00PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20
    Input Text    //*[@id="pickingoffhour"]    45AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 84
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    09/07/2023
    Input Text    //*[@id="pickinguphour"]    PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20
    Input Text    //*[@id="pickingoffhour"]    15.45AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 85
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    2023
    Input Text    //*[@id="pickinguphour"]    15.20PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    15AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 86
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    2023
    Input Text    //*[@id="pickinguphour"]    15.20PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    15AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 87
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    01/20/2023
    Input Text    //*[@id="pickinguphour"]    20.00PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    2023
    Input Text    //*[@id="pickingoffhour"]    15AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 88
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    01/20
    Input Text    //*[@id="pickinguphour"]    20.PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    15AM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 89
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    01/20
    Input Text    //*[@id="pickinguphour"]    20.PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    15.15PMM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
    Close Browser
    Log    Test Completed
    
RentalTest 91
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    01/20/2023
    Input Text    //*[@id="pickinguphour"]    20.PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    15.15PMM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 92
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    00
    Input Text    //*[@id="pickinguphour"]    20.30PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    10/20/2023
    Input Text    //*[@id="pickingoffhour"]    15.15PMM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 93
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    Medan
    Input Text    //*[@id="pickingupdate"]    00
    Input Text    //*[@id="pickinguphour"]    20.30PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    /2023
    Input Text    //*[@id="pickingoffhour"]    15.15PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 94
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    04/15/2023
    Input Text    //*[@id="pickinguphour"]    20.30PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    /2023
    Input Text    //*[@id="pickingoffhour"]    1PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 95
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    5/2023
    Input Text    //*[@id="pickinguphour"]    30PM
    Input Text    //*[@id="pickingoff"]    Laguboti
    Input Text    //*[@id="pickingoffdate"]    /2023
    Input Text    //*[@id="pickingoffhour"]    1PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed
    
RentalTest 100
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwitanapitupulu@gmail.com
    Input Password    password    putriwita11
    Click Element    //*[@id="login"]/form/button
    Click Element    xpath=/html/body/header/div[2]/div/nav/div/ul/li[5]/a
    Sleep    3
    Click Element    xpath=/html/body/main/div/div[2]/div/div/div/div[1]/div/a
    Input Text    //*[@id="pickinglocation"]    ${empty}
    Input Text    //*[@id="pickingupdate"]    5/2023
    Input Text    //*[@id="pickinguphour"]    30PM
    Input Text    //*[@id="pickingoff"]    ${empty}
    Input Text    //*[@id="pickingoffdate"]    /2023
    Input Text    //*[@id="pickingoffhour"]    00PM
    Sleep    5
    Click Element     //*[@id="formSearchSubmit3"]
    sleep    10
    Close Browser
    Log    Test Completed