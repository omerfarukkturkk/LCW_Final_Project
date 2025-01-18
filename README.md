# LCW Web Otomasyon Projesi

## Proje Hakkında
Bu proje, **LC Waikiki** web sitesi üzerinde uçtan uca test senaryolarını otomatikleştirmek amacıyla geliştirilmiştir. Proje, **Page Object Model (POM)** tasarımı kullanılarak yazılmıştır ve kullanıcı deneyimini artırmaya yönelik senaryoları test etmeyi hedefler.

</br>

## Kullanılan Teknolojiler
- **Dil:** Java
- **Framework:** Selenium, TestNG
- **Raporlama:** ExtentReports, Allure Reports
- **Build Aracı:** Maven
- **Sürücü Yönetimi:** WebDriverManager
- **Versiyon Kontrol:** Git

</br>

## Kurulum ve Çalıştırma

### Gereksinimler
- **JDK:** 11 veya üstü
- **Maven:** 3.8 veya üstü
- **IDE:** IntelliJ IDEA, Eclipse veya diğerleri
- **Tarayıcı Sürücüleri:** ChromeDriver vb.

### Setup
1. **GitHub'dan projeyi klonlayın:**
   - GitHub üzerinde depo ana sayfasına gidin.
   - Depo isminin altında **Clone or download** butonuna tıklayın.
   - **HTTPS** seçeneğini kullanarak bağlantıyı kopyalayın.

2. **Komut satırında aşağıdaki adımları izleyin:**
   ```bash
   git clone <repository-url>

</br>

## Proje Yapısı

### **Pages**
- BasePage  
- LoginPage  
- Homepage  
- CategoryPage  
- FiltrePage  
- ProductPage  
- CartPage  
- FavouritePage  

### **Utilities**
- Log  
 

### **Tests**
- BaseTest  
- LoginTest  
- CategoryTest  
- FiltreTest  
- ProductTest  
- CartTest  
- FavouriteTest  

### **Utility**
#### **ExtentReports**
- ExtentManager  
- ExtentTestManager  

#### **Listeners**
- TestListeners 

### **Proje Kök Dizinindeki Dosyalar**
- `pom.xml`  

</br>

## Launch

1. **WebDriver Port Ayarları:**  
   Proje çalıştırılmadan önce WebDriver Manager otomatik olarak tarayıcı sürücüsünü ayarlayacaktır, bu nedenle manuel bir port değişikliği gerekmez.

2. **Projeyi Çalıştırma:**  
   - Projeyi bir IDE'de (örneğin IntelliJ IDEA veya Eclipse) açın.  
   - `tests` paketine gidin ve çalıştırmak istediğiniz testi seçin. Örneğin:  
     - `LoginTest`  
     - `CategoryTest`  
     - `CartTest` vb.  

3. **Testi Çalıştırma:**  
   - Çalıştırmak istediğiniz test sınıfına sağ tıklayın ve **"Run"** seçeneğini seçin.  

4. **Raporları Görüntüleme:**  
   - Test tamamlandıktan sonra raporlar otomatik olarak oluşturulacaktır.  
     - **Allure Raporu:** `allure-results` klasöründe saklanır. Görüntülemek için proje dizinine gidin ve bu komutu çalıştırın:  
       ```bash
       allure serve allure-results/
       ```
     - **ExtentReports Raporu:** `target/ExtentReports.html` dosyasında saklanır ve bir tarayıcıda açılarak görüntülenebilir.

</br>

Eğer eklemek veya özelleştirmek istediğiniz başka bir şey varsa, bana ulaşabilirsiniz! 👌


