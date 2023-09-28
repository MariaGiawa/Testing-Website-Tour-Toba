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
    
Hotel 1
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    hotel labersa
    Input Text    lokasi    Balige
    Input Text    harga    200000  
    Input Text    //*[@id="description"]    harga terjangkau    
    Choose File    xpath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\labersa1.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
Hotel 2
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel Sumber Pulo Mas Samosir
    Input Text    lokasi    Tuktok Siadong
    Input Text    harga    262000 
    Input Text    //*[@id="description"]    Jl. Tuk Tuk Siadong, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\sumberpulo.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30   
    Close Browser
    Log    Test Completed  
Hotel 3
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel My Nasha Tigaras Simalungun
    Input Text    lokasi    Haranggaol Horison
    Input Text    harga    600000
    Input Text    //*[@id="description"]    Tigaras, Dolok Pardamean, Haranggaol Horison, Danau Toba, Sumatera Utara, Indonesia, 21163    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\MyNasha.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed 
Hotel 4
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel Hotel Sapadia Parapat
    Input Text    lokasi    Parapat
    Input Text    harga    510000
    Input Text    //*[@id="description"]    Jalan Josep Sinaga No 2, Kab. Simalungun,, Parapat, Danau Toba, Sumatera Utara, Indonesia, 41174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30   
    Close Browser
    Log    Test Completed 
Hotel 5
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY} 
    Input Text    lokasi    Simanindo
    Input Text    harga    709000
    Input Text    //*[@id="description"]    Jl.Pangambatan Desa Tomok Samosir. Sumatera Utara. Indonesta, Samosir, Danau Toba, Sumatera Utara, Indonesia, 22359    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\TobaBeachHotel.webp
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed 
 Hotel 6
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY} 
    Input Text    lokasi    Balige
    Input Text    harga    709000
    Input Text    //*[@id="description"]    JALAN PARDEDE PASIR NO 10, PARDEDE ONAN, TOBA, BALIGE, Balige, Danau Toba, Sumatera Utara, Indonesia, 22314   
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\pardede.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed 
 Hotel 7
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY} 
    Input Text    lokasi    Pangururan
    Input Text    harga    183260
    Input Text    //*[@id="description"]    Jl. Raya Simanindo, Dosroha, Simanindo, Kabupaten Samosir, Sumatera Utara 22395, Samosir, Danau Toba, Sumatera Utara, Indonesia,    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input   C:\\Users\\USER\\Downloads\\gambar\\panguruan.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed 
    
 Hotel 8
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Tuktuk Timbul Bungalows
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    312757
    Input Text    //*[@id="description"]   Jl. Lkr. Tuktuk, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\tuktuk.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
     
    
 Hotel 9
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Nabasa Hotel Balige
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    400000
    Input Text    //*[@id="description"]    Jalan Siliwangi No. 08 Balige, Toba Samosir, Balige, Danau Toba, Sumatera Utara, Indonesia, 22311    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\nabasa.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed 
    
Hotel 10
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hermina Hotel
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    228915
    Input Text    //*[@id="description"]    Jl. Kol. TPR Sinaga, Tiga Raja, Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\hermina.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 11
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Toba Village Inn
    Input Text    lokasi    Tuktuk Siadong
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    Jalan Lingkar, Tuk tuk Siadong, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\vilage.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 12
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Darma Agung Beach Hotel Parapat
    Input Text    lokasi    Parapat
    Input Text    harga    1.000.000
    Input Text    //*[@id="description"]    Jalan Sipora-pora No. 4 Girsang, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\darma.jpeg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 13
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Siantar Hotel Parapat
    Input Text    lokasi    Parapat
    Input Text    harga    416500
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\siantar.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 14
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel Anugrah Situngkir 3 near Creative Hub Pangururan Samosir RedPartner
    Input Text    lokasi    Samosir
    Input Text    harga    241570
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\anugrah.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 15
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Dumasari Hotel
    Input Text    lokasi    Samosir
    Input Text    harga    241570
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\dumasari.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 16
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Judita Cottage
    Input Text    lokasi    Samosir
    Input Text    harga    350000
    Input Text    //*[@id="description"]    Jalan Lingkar Tuktuk Siadong Samosir Sumatera Utara, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395  
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed
  
Hotel 17
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Anju Cottages
    Input Text    lokasi    Tuktuk Siadong
    Input Text    harga    350000
    Input Text    //*[@id="description"]    Jalan Lingkar Tuktuk Siadong Samosir Sumatera Utara, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395  
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 18
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Parapat View Hotel
    Input Text    lokasi    Parapat
    Input Text    harga    702957
    Input Text    //*[@id="description"]    Jl. Sidaha Pinto No. 7 Parapat, Girsang Sipangan Bolon Simalungun, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174  
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 19
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     Hotel Parapat
    Input Text    lokasi    Parapat
    Input Text    harga    1000000000@
    Input Text    //*[@id="description"]    Jalan Sipora-pora No. 4 Girsang, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\darma.jpeg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed
 
Hotel 20
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      ${EMPTY}
    Input Text    lokasi     ${EMPTY}
    Input Text    harga    702957
    Input Text    //*[@id="description"]    Jalan TPR No. 12 Simalungun, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\pandu.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 21
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      ${EMPTY}
    Input Text    lokasi     ${EMPTY}
    Input Text    harga    1204900
    Input Text    //*[@id="description"]    LABERSA TOBA HOTEL & CONVENTION CENTER    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\labersa.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 22
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      ${EMPTY}
    Input Text    lokasi     ${EMPTY}
    Input Text    harga    450000
    Input Text    //*[@id="description"]    Jalan Lingkar Tuktuk Siadong, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\lakjon.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 23
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Hotel Anugrah Situngkir 3 near Creative Hub Pangururan Samosir RedPartner
    Input Text    lokasi     ${EMPTY}
    Input Text    harga     ${EMPTY}
    Input Text    //*[@id="description"]    Jalan Raya Simanindo, , Sialanguan, Pangururan, Samosir, Danau Toba, Sumatera Utara, Indonesia, 22395	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\situngkir.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 24
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Star Beach Hotel
    Input Text    lokasi     ${EMPTY}
    Input Text    harga     ${EMPTY}
    Input Text    //*[@id="description"]    JLN JUSTIN SIRAT LONG BEACH AJIBATA Parapat, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21455	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\star.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 25
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Niagara Hotel Lake Toba & Resorts
    Input Text    lokasi     ${EMPTY}
    Input Text    harga     limaratusribu
    Input Text    //*[@id="description"]    Jalan Pembangunan No. 1 Parapat, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\niagra.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 26
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Agape Hotel Haranggaol
    Input Text    lokasi     ${EMPTY}
    Input Text    harga      1212000
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\agapa.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 27
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Raja Hotel Samosir
    Input Text    lokasi     ${EMPTY}
    Input Text    harga      350000
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\raja.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 28
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      DIO REFAEL HOTEL TIGARAS
    Input Text    lokasi     ${EMPTY}
    Input Text    harga      500000
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\dio.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed

Hotel 29
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel Hotel Sapadia Parapat
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    510000
    Input Text    //*[@id="description"]    Jalan Josep Sinaga No 2, Kab. Simalungun,, Parapat, Danau Toba, Sumatera Utara, Indonesia, 41174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed   
    
Hotel 30
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel Hotel Sapadia Parapat
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    510000
    Input Text    //*[@id="description"]    Jalan Josep Sinaga No 2, Kab. Simalungun,, Parapat, Danau Toba, Sumatera Utara, Indonesia, 41174    
     Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed       
Hotel 31
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Mafir Hotel & Restaurant
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    300000
    Input Text    //*[@id="description"]    Jalan lingkar tuktuk siadong, Samosir, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395   
     Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 32
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     ${EMPTY}
    Input Text    lokasi    Balige    
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    Jalan Tarutung No.120, Balige, Danau Toba, Sumatera Utara, Indonesia, 22312   
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\mutiara.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed  
     
Hotel 33
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     ${EMPTY}
    Input Text    lokasi    Parapat   
    Input Text    harga    2345353%4
    Input Text    //*[@id="description"]    Jalan Justin Sirait No.30 Ajibata, Toba Samosir, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174   
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\opris.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 34
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     ${EMPTY}
    Input Text    lokasi    Balige   
    Input Text    harga    seratusjuta
    Input Text    //*[@id="description"]    JALAN PARDEDE PASIR NO 10, PARDEDE ONAN, TOBA, BALIGE, Balige, Danau Toba, Sumatera Utara, Indonesia, 22314   
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed   
    
Hotel 35
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     ${EMPTY}
    Input Text    lokasi    Balige   
    Input Text    harga    445500
    Input Text    //*[@id="description"]     ${EMPTY}      
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
Hotel 36
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Tuktok Siadong
    Input Text    harga    262000 
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\sumberpulo.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
    

Hotel 37 
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Tuktok Siadong
    Input Text    harga    344701 
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\siadong.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed 
    
Hotel 38
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Tuktok Siadong
    Input Text    harga    162000
    Input Text    //*[@id="description"]    Jl. Lkr. Tuktuk No.115, Toba, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451318   
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
    
Hotel 39
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Tara Bunga
    Input Text    harga    540000
    Input Text    //*[@id="description"]    Jl. Raya TaraBunga, Tara Bunga, Kec. Tampahan, Toba, Sumatera Utara 22312•0813-7689-0759   
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
    
Hotel 40
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Kabupaten Karo
    Input Text    harga    1635671
    Input Text    //*[@id="description"]    Jl. Raya Merek No.KM, RW.9, Kodon-Kodon, Kec. Merek, Kabupaten Karo, Sumatera Utara 22173•0811-6077-616   
   Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\tongging.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
    
Hotel 41
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Laster Jony's
    Input Text    lokasi    Tuktuk Siadong
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}   
   Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\tuktuk.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
 
Hotel 42
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Lakeside Eatery & Stay
    Input Text    lokasi    Lumban Silintong
    Input Text    harga    2.000.000
    Input Text    //*[@id="description"]    ${EMPTY}   
   Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\silintong.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed  
    
 Hotel 43
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Tuktuk Timbul Bungalows
    Input Text    lokasi    Samosir
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]   ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\tuktuk.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed 
 
Hotel 44
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      LABERSA TOBA HOTEL & CONVENTION CENTER
    Input Text    lokasi     Balige
    Input Text    harga     234$4657
    Input Text    //*[@id="description"]    Jalan Raya Pematangsiantar- Balige Toba  Samosir, Balige, Danau Toba, Sumatera Utara, Indonesia, 22312    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 45
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Agape Hotel Haranggaol
    Input Text    lokasi     Haranggaol Horison
    Input Text    harga       ${EMPTY}
    Input Text    //*[@id="description"]    Jl. Tangga Batu, Kel. Haranggaol, Kec, Haranggaol Horison, Kab. Simalungun, Haranggaol Horison, Danau Toba, Sumatera Utara, Indonesia, 21165	    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 46
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     Pondok Tabo
    Input Text    lokasi     Simanindo
    Input Text    harga    $23456
    Input Text    //*[@id="description"]    Jl. Lkr. Tuktuk No.115, Toba, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451318	    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 47
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     Rogate Beach Hotel
    Input Text    lokasi     Ambarita
    Input Text    harga    321750
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 48
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     Hotel Pantai Bintang
    Input Text    lokasi     Ajibata
    Input Text    harga    321750
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 49
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     Sony Cottage Samosir
    Input Text    lokasi     Samosir
    Input Text    harga    179865
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    30    
    Close Browser
    Log    Test Completed
    
Hotel 50
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel     Sony Cottage Samosir
    Input Text    lokasi     Samosir
    Input Text    harga       ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    

Hotel 51
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Lakeside Eatery & Stay
    Input Text    lokasi    Lumban Silintong
    Input Text    harga    12.899.999
    Input Text    //*[@id="description"]    ${EMPTY}   
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10  
    Close Browser
    Log    Test Completed
    

Hotel 52
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Hotel Hotel Sapadia Parapat
    Input Text    lokasi    Parapat
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed   
    
Hotel 53
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Sapadia Hotel and Cottage Parapat
    Input Text    lokasi    Kabupaten Simalungun,
    Input Text    harga    $$23565
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed   
    
Hotel 54
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Sapadia Hotel and Cottage Parapat
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    286625
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed 
    
Hotel 55
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Bagus Bay Guest House
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    315207
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\bagus.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed  
    
Hotel 56
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Vantas Hotel Parbaba
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    346667
    Input Text    //*[@id="description"]    ${EMPTY}    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed  
    
Hotel 57
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Hotel Sedayu 2
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    233720
    Input Text    //*[@id="description"]    ${EMPTY}    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed  
    
Hotel 58
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Kabupaten Humbang Hasundutan
    Input Text    harga    382809
    Input Text    //*[@id="description"]    ${EMPTY}    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 59
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Kabupaten Humbang Hasundutan
    Input Text    harga    332500
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\OMPU.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 60
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Simanindo
    Input Text    harga    350000
    Input Text    //*[@id="description"]    ${EMPTY}    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 61
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Kabupaten Samosir
    Input Text    harga    350000
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\sunset.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
     

Hotel 62
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    350000
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed 
    
Hotel 63
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    550000
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\agapa.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed 
    
Hotel 64
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    1950000
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\nabasa.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 65
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Parapat
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\darma.jpeg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed 
    
Hotel 66
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Tuktuk Siadong
    Input Text    harga    230.000
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\sibayak.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed 
    
Hotel 67
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi    Laguboti
    Input Text    harga    6723^
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\huber.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed 
    
Hotel 68
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Hotel Huber
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\huber.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed 
    
Hotel 69
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Agape Hotel Haranggaol
    Input Text    lokasi     ${EMPTY}
    Input Text    harga      limajuta12
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\agapa.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
      
Hotel 70
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel      Raja Hotel Samosir
    Input Text    lokasi     ${EMPTY}
    Input Text    harga      12limajuta
    Input Text    //*[@id="description"]    ${EMPTY}	    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\raja.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
  
Hotel 71
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    harga4juta
    Input Text    //*[@id="description"]    Jl. Kol. TPR Sinaga, Tiga Raja, Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\hermina.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed
    
Hotel 72
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    Jl. Marihat No.1, Danau Toba, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•(0625) 41012    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\khas.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 73
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    ${EMPTY}
    Input Text    harga    lima ratus ribu
    Input Text    //*[@id="description"]    Kampung Tuktuk Siadong, Kecamatan Simanindo, Ambarita, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451346    
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\kampung.png
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
     

Hotel 74
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Ambarita   
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    Kampung Tuktuk Siadong, Kecamatan Simanindo, Ambarita, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451346    
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 75
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Ambarita   
    Input Text    harga    380#678
    Input Text    //*[@id="description"]    Jl. Silahi Sabungan, Silalahi 3, Sabungan, Paropo, Kec. Silahsabungan, Kabupaten Dairi, Sumatera Utara 22281•0811-6067-661
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
     
   
Hotel 76
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi    Tuk tuk   
    Input Text    harga    seratusdolar
    Input Text    //*[@id="description"]    JTerletak di Tuk Tuk, 1,6 km dari Ambarita, Reggae Guest House menawarkan akomodasi dengan restoran, tempat parkir pribadi gratis, bar, dan lounge bersama. 5. Kamar triple ini memiliki balkon, pintu masuk pribadi, dan teras.
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 77
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga    711000
    Input Text    //*[@id="description"]    Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara•0813-6297-6002
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 78
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga    1079415
    Input Text    //*[@id="description"]    Jl. Muara, Kabupaten Humbang Hasundutan, Sumatera Utara 22457•0822-9815-0711
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\muara.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 79
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    ${EMPTY}
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga    382809
    Input Text    //*[@id="description"]    Jl. Pembangunan No.1, Parapat, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•(0625) 41028
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    

Hotel 80
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    RedDoorz @ Tuktuk Danau Toba
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   $3000afs
    Input Text    //*[@id="description"]    Jl. Pembangunan No.1, Parapat, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•(0625) 41028
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 81
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel    Marianna Resort & Convention
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   ${EMPTY}
    Input Text    //*[@id="description"]    Jl. PUD Keluarahan, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 4501999
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\marianna.doc
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed
      

Hotel 82
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Pandu Lakeside Hotel
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   dua ratus ribu rupiah
    Input Text    //*[@id="description"]    Jl. Kol. TPR Sinaga No.12, Tiga Raja, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•0821-6454-4981
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 83
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Pandu Lakeside Hotel
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\marianna.doc
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 84
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Hotel kalder one
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   123233432*
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 85
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   Lake one hotel
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed
    
Hotel 86
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY}
    Input Text    lokasi     Laguboti
    Input Text    harga   12jutarupiah
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 87
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     siborong-borong 
    Input Text    harga   ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed
    
Hotel 88
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     silangit 
    Input Text    harga   870.900.00
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    

Hotel 89
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\lakjon.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    5    
    Close Browser
    Log    Test Completed
    
Hotel 90
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   seratusriburupiah
    Input Text    //*[@id="description"]    ${EMPTY}
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\MARIANNA.PNG
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 91
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   ${EMPTY}
    Input Text    //*[@id="description"]    ${EMPTY}
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\pandu.jpg
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 92
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   3000000
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 93
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   1000000
    Input Text    //*[@id="description"]    ${EMPTY}
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\sunset.pdf
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 94
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga   3000000
    Input Text    //*[@id="description"]    ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 95
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga    ${EMPTY}
    Input Text    //*[@id="description"]    Jl. Lkr. Tuktuk, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 96
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi     ${EMPTY} 
    Input Text    harga    {345.000}
    Input Text    //*[@id="description"]    JALAN PARDEDE PASIR NO 10, PARDEDE ONAN, TOBA, BALIGE, Balige, Danau Toba, Sumatera Utara, Indonesia, 22314
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 97
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    **230.990
    Input Text    //*[@id="description"]    Jl.Pangambatan Desa Tomok Samosir. Sumatera Utara. Indonesta, Samosir, Danau Toba, Sumatera Utara, Indonesia, 22359
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 98
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    =120000
    Input Text    //*[@id="description"]     ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10   
    Close Browser
    Log    Test Completed
    
Hotel 99
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    888,000
    Input Text    //*[@id="description"]     ${EMPTY}
    Choose File    XPath=//*[@id="layoutSidenav_content"]/main/div/form/div[2]/div[2]/div/input    C:\\Users\\USER\\Downloads\\gambar\\marianna.doc
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
    
Hotel 100
    Open Browser    http://127.0.0.1:8000/user/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    email    maria569@gmail.com
    Input Password    password    maria123
    Click Element   //*[@id="login"]/form/button   
    Click Element   //*[@id="sidenavAccordion"]/div/div[1]/a[2]
    Click Element    //*[@id="collapseHotel"]/nav/a[1]
    Click Element    //*[@id="layoutSidenav_content"]/main/div/div[1]/a/button
    Input Text    nama_hotel   ${EMPTY} 
    Input Text    lokasi    ${EMPTY} 
    Input Text    harga    999,000,00
    Input Text    //*[@id="description"]     ${EMPTY}
    Execute Javascript    document.getElementById("layoutSidenav_content").value = ''
    Click Element    //*[@id="layoutSidenav_content"]/main/div/form/button     
    Sleep    10    
    Close Browser
    Log    Test Completed
 

    