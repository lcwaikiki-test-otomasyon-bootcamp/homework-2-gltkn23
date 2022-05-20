Feature: LCWaikiki Login page

  Scenario: sepete ürün ekleme
    Given Uygulama açılır
    When Giriş yapa tıklanır
    When Mail ve şifre girirlir
    When Giriş yap tıklanır
    When Arama cubuguna "kazak" yazılır
    When Ara butonuna tiklanir
    Then Source page sayfaasının geldiği kontrol edilir
    When 1. siradaki ayakakbıya tıklanir
    Then Urunun sayfasini acildiği kontrol edilir
    When kazak bedeni "S" secilir
    When Sepete eklme tiklanır
    When Sepete gidilir
    Then Urunun sepete eklendiği kontrol edilir
