# 💼 IBB ATM JavaFX Uygulaması

JavaFX kullanılarak geliştirilen bu masaüstü uygulama, panel tabanlı mimari ile **giriş yetkilendirme, kullanıcı yönetimi, KDV hesaplama, tema-dil geçişi, bildirim sistemi, saat takibi ve not defteri** gibi özellikleri sunar.

## 🚀 Özellikler

### 🔐 Giriş ve Rol Bazlı Yetkilendirme
- Kullanıcılar `ADMIN`, `OPERATOR`, `USER` rollerine sahiptir.
- BCrypt ile şifrelenmiş güvenli giriş
- Giriş sonrası role özel ekran yönlendirmesi

### 👥 Kullanıcı Yönetimi
- Kullanıcıları listeleme, filtreleme (isim, e-posta, rol)
- Kullanıcı ekle, güncelle, sil
- Rol atama ve şifre sıfırlama
- `TableView` + `TextField` + `ComboBox` ile dinamik filtreleme

### 🧮 KDV Hesaplama Paneli
- Tutar ve oran girerek anında KDV hesaplama
- Fiş no, tarih, açıklama ile işlem kaydı
- TXT / PDF / EXCEL dışa aktarım
- Kayıt arama + yazdırma + e-posta gönderme

### 🌓 Tema ve Dil Desteği
- Açık / Karanlık tema geçişi
- Türkçe / İngilizce arayüz desteği
- `ResourceBundle` + `Scene.getStylesheets()` kullanımı

### 🔔 Bildirim Sistemi
- Popup bildirimler (başarı, uyarı, hata)
- "Geçmiş Bildirimler" butonuyla log listeleme

### 👤 Profil Yönetimi
- Giriş yapan kullanıcı bilgileri
- Şifre değiştirme

### 💾 Yedekleme & Geri Yükleme
- JSON veya XML formatında dışa aktarım
- `FileChooser` ile manuel yedek seçme
- Tabloyu geri yükleme sonrası güncelleme

### ⏰ Saat ve Tarih
- `clockLabel` ile her saniye güncellenen saat
- `Timeline` veya `ScheduledExecutorService` tabanlı canlı takvim

### 📝 Not Defteri
- CRUD işlemleri ile kişisel notlar
- Her not için alarm saati tanımı
- Süresi gelen notlar popup uyarı ile gösterilir

---

## ⚙️ Nasıl Çalıştırılır?

```bash
mvn clean javafx:run
# ibbWithEcodation-Atm-Project
