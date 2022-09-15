@task1
Feature: A101 web sayfasindan siyah dizalti corap alma

  Scenario:
    Given Kullanici 'A101' web sayfasina gider
    Then Kullanici cerezleri kabul eder
    And Kullanici giyim ve aksesuar linkinin uzerine gelir
    And Kullanici kategorilerin gorulmesini bekler ve kadin ic giyim kategorisinde dizalti corap secenegine tiklar
    And Kullanici ekrani renk kategorileri gorulene kadar asagi indirir
    And Kullanici dizalti corap sonuclarini siyah renk olarak filtreler
    And Kullanici siyah renk filtresinin aktif oldugunu dogrular
    And Kullanici rastgele bir urunu sepete ekler
    And Kullanici sepeti goruntule butonunu tiklar
    And Kullanici siparisi onayla butonuna basar
    And Kullanici acilan sayfada uye olmadan devam et butonuna tiklar