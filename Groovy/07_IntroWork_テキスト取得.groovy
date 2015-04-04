@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')


import geb.Browser

Browser.drive {

    go 'file:///D:/Temp/handson/introWork/introWork_テキスト取得.html'
    
    //画面の値を取得

}