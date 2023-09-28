*** Settings ***
Library    SeleniumLibrary
Library    OperatingSystem

*** Test Cases ***
FirstTest
    Log    Hello world...
    
TryTest
    Open Browser    https://cis.del.ac.id/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    2
    Input Text    loginform-username    if321069
    Input Password    loginform-password    fransiska44
    Click Element    //*[@id="login-form"]/div[2]/div[2]/button    
    Sleep    3
    Close Browser
    Log    Test Completed
    
Login1
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yessi@gmail.com
    Input Password    password    yessi123
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login2
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    diana@gmail.com
    Input Password    password    diana122
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login3
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ameliana@gmail.com
    Input Password    password    ameliana333
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login4
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    anggara@gmail.com
    Input Password    password    anggara044
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login5
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    indah@gmail.com
    Input Password    password    indah@indah
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login6
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melisa@gmail.com
    Input Password    password    melisa455
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login7
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jelita@gmail.com
    Input Password    password    jelita#44
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login8
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    oktaviana@gmail.com
    Input Password    password    oktaviana&yes
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login9
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    heskial567@gmail.com
    Input Password    password    hesyess
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login10
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melinta@gmail.com
    Input Password    password    melinta009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login11
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melinta@gmail.com
    Input Password    password    melinta009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login12
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwita@gmail.com
    Input Password    password    putri765
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login13
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    glaydissimorangkir@gmail.com
    Input Password    password    glaydissimorangkir1234
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
    
Login14
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yudhipurba@gmail.com
    Input Password    password    yudhipurba06
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login15
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    elsaday45@gmail.com
    Input Password    password    elsaday45
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login16
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahow@gmail.com
    Input Password    password    dinda78$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login17
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahow@gmail.com
    Input Password    password    dinda78$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
  
Login18
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail.com
    Input Password    password    yesenin001
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login19
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail.com
    Input Password    password    yesenin001
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login20
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jenniblaclk@gmail.com
    Input Password    password    blackpink123
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login21
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    saimari@gmail.com
    Input Password    password    saimarip900
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login22
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yunandaarst@gmail.com
    Input Password    password    yunandaarst6788
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login23
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jaeminnct@gmail.com
    Input Password    password    jaeminnct122
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login24
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    akumilani@gmail.com
    Input Password    password    akumilani67$6
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login25
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    mariagiawa123@gmail.com
    Input Password    password    mariagiawa####
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login26
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yessiii@gmail.com
    Input Password    password    yessi123
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login27
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    diaa@gmail.com
    Input Password    password    diana122
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login28
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ameliana@gmail.co
    Input Password    password    ameliana333
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login29
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    anggaragmail.com
    Input Password    password    anggara044
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login30
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    indah
    Input Password    password    indah@indah
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login31
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    meli33sa@gmail.com
    Input Password    password    melisa455
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login32
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jelita@gmail.comm
    Input Password    password    jelita#44
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login33
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    oktaviana@@gmail.com
    Input Password    password    oktaviana&yes
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login34
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    heskial5667@gmail.com
    Input Password    password    hesyess
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login35
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melia@gmail.com
    Input Password    password    melinta009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login36
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melinta@gmail..com
    Input Password    password    melinta009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login37
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putri@gmail.com
    Input Password    password    putri765
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login38
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    glaydissimorangkir@gmal.com
    Input Password    password    glaydissimorangkir1234
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
    
Login39
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yudhipurba@gmmail.com
    Input Password    password    yudhipurba06
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login40
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    elsaday45@gmaill.com
    Input Password    password    elsaday45
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login41
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahhow@gmail.com
    Input Password    password    dinda78$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login42
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ${EMPTY} 
    Input Password    password    dinda78$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
  
Login43
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail@.com
    Input Password    password    yesenin001
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login44
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    12yesenin@gmail.com
    Input Password    password    yesenin001
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login45
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jenniblaclk@gmaail.com
    Input Password    password    blackpink123
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login46
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email     ${EMPTY} 
    Input Password    password    saimarip900
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login47
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yunandaarst.com
    Input Password    password    yunandaarst6788
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login48
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    nct@gmail.com
    Input Password    password    jaeminnct122
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login49
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    akumani@gmail.com
    Input Password    password    akumilani67$6
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login50
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    mariaGIawa123@mail.com3
    Input Password    password    mariagiawa####
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login51
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yessi@gmail.com
    Input Password    password    yessi1223
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login52
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    diana@gmail.com
    Input Password    password    dianA122
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login53
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ameliana@gmail.com
    Input Password    password    ameliana33
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login54
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    anggara@gmail.com
    Input Password    password    anggarra044
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login55
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    indah@gmail.com
    Input Password    password    indah@indahh
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login56
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melisa@gmail.com
    Input Password    password    lisa455
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login57
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jelita@gmail.com
    Input Password    password    jelita#@44
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login58
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    oktaviana@gmail.com
    Input Password    password    ${EMPTY} 
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login59
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    heskial567@gmail.com
    Input Password    password    hesyeEss
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login60
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melinta@gmail.com
    Input Password    password    melinTa009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login61
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melinta@gmail.com
    Input Password    password    meli5nta009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login62
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwita@gmail.com
    Input Password    password    putri76@5
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login63
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    glaydissimorangkir@gmail.com
    Input Password    password    glaydissimorangkir
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
    
Login64
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yudhipurba@gmail.com
    Input Password    password    yudhiPurba06
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login65
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    elsaday45@gmail.com
    Input Password    password     ${EMPTY} 
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login66
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahow@gmail.com
    Input Password    password    dinda8$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login67
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahow@gmail.com
    Input Password    password    dina78$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
  
Login68
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail.com
    Input Password    password    yeseninnn001
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login69
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail.com
    Input Password    password    yenin001
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login70
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jenniblaclk@gmail.com
    Input Password    password    blackpink1123
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login71
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    saimari@gmail.com
    Input Password    password     ${EMPTY} 
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login72
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yunandaarst@gmail.com
    Input Password    password    yunandrst6788
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login73
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jaeminnct@gmail.com
    Input Password    password    jaeminnhct122
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login74
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    akumilani@gmail.com
    Input Password    password    akumilan99i67$6
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login75
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    mariagiawa123@gmail.com
    Input Password    password    mariagiawa###
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    

Login76
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ${EMPTY}
    Input Password    password    ${EMPTY}
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login77
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ${EMPTY}
    Input Password    password    diana12
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login78
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    ameliana@gmail..com
    Input Password    password    ${EMPTY}
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login79
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    anggaragmail.com
    Input Password    password    anggara04
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login80
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    indah@gmail.cm
    Input Password    password    indahindah
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login81
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melisa@gmail.coM
    Input Password    password    melsa455
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login82
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jelita@gmAil.com
    Input Password    password    jelita#4*4
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login83
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    oktaviana@gil.com
    Input Password    password    oktaviana&ye
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login84
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    heskial5567@gmail.com
    Input Password    password    hesyss
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login85
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melinta@.com
    Input Password    password    melint009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login86
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    melintagmail.com
    Input Password    password    meinta009
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login87
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    putriwita@gmaiil.com
    Input Password    password    puTri765
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Login88
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    glaydiSsimorangkir@gmail.com
    Input Password    password    glayDissimorangkir1234
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
    
Login89
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yudhipurba@Gmail.com
    Input Password    password    yudhip8rba06
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Login90
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    elsaday45@gml.com
    Input Password    password    elsady45
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login91
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahow@gmai.com
    Input Password    password    dinda78$$
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
    
Login92
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    dindahow@gmail.*com
    Input Password    password    dinda78$(
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed  
  
Login93
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail.com
    Input Password    password    yesenin@gmail.com
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login94
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yesenin@gmail.com
    Input Password    password    ${EMPTY}
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login95
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jenniblaclk@gmaail.com
    Input Password    password    blacpink123
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login96
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    saimari@gmail.om
    Input Password    password    saimarip9000
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login97
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    yunandaarsgmail.com
    Input Password    password    yunaaarst6788
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login98
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    jaeminnct@gmail.com
    Input Password    password    jaeminnct1222
    Click Element    //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login99
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    akumilani@gmailcom
    Input Password    password    akumilai67$6
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Login100
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    mariagiawa1223@gmail.com
    Input Password    password    mariagiawa#####
    Click Element   //*[@id="login"]/form/button   
    Sleep    10    
    Close Browser
    Log    Test Completed 
    