# Turkcell-Flight-Service
Genç Yetenek Projesi

Öncelikle projeyi oluşturduktan sonra kullancağım Spring kütüphanelerini pom.xml dosyasına ekledim. Proje mimarisi olarak aşağıdaki katmanlı yapıyı kurmaya çalıştım. Proje ile ilgile genel bilgiler aşağıdaki gibidir:

-Repository katmanında dosyadan veriler okunmakta, Service katmanında ise gerekli filtereleme işlemleri(searchCriteria ve searchKey) yapılmakta/uygulanmaktadır.

-@Autowired yapısı ile interface'in kullanıldığı servis bulunmaktadır ve bu yapı bize dependency injection sağlamaktadır.

-"jackson-dataformat-xml" kütüphanesi ile json olarak oluşturular veriler XML formatına çevrilmiştir. (SOAP)

-"Flight" objesi her bir uçusu ve bu uçuşla ilgili bilgileri ifade etmektedir. Her bir uçusun "companyName", "planeModel", "flightFrom", "flightTo", "takeOffTime" bilgileri bulunmaktadır. (OnurAir;Boeng;Ankara;Trabzon;22:00) gibi...

-Proje http://localhost:8080/rest/ base url'i üzerinden çalıştırılmıştır.

-"?searchCriteria=" alanına, hangi alanda filtreleme yapılacak ise o alanın ismi verilmelidir. ("companyName", "planeModel", "flightFrom", "flightTo", "takeOffTime")

-"searchKey=" alanına istenilen key girilmelidir. O key'i içeren sonuçlar cevap olarak dönecektir.

-"searchCriteria" ve "searchKey" alanları zorunlu alanlar değildir. 

-Hatalı parametreler girildiğinde boş liste dönmektedir.

-Birkaç örnek istek:

http://localhost:8080/rest/flights?searchCriteria=companyName&searchKey=p (companyName alanında "p" harfini içeren kayıtlar)

http://localhost:8080/rest/flights?searchCriteria=planeModel&searchKey=air (planeModel alanında "air" içeren kayıtlar)

http://localhost:8080/rest/flights?searchCriteria=all&searchKey=t (alanlarının herhangi birinde "t" içeren kayıtlar)

-Testler manuel şekildei url üzerinde parametreleri değiştirerek yapılmıştır. Unit testing gibi bir testleme bilgi sahibi olmadığım için yapılmamıştır.

![SS](https://user-images.githubusercontent.com/45923198/84567915-a7292000-ad84-11ea-9119-7b4c6d0874ee.png)





