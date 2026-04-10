# My java knowledge so far
ini adalah rangkuman semua pengetahuan saya tentang java sejauh ini

## Jobsheet 1
### 1. Jelaskan apa kegunaan memasukkan lokasi folder bin dari Java ke dalam variabel PATH!
kalo misalnya tanpa setting path entar kita harus nulis alamat lengkap lokasi java setiap kali mau jalanin perintah misalnya ketik manual kayak gini: ``` C:\Program Files\Java\jdk-21\bin\javac ``` ,nah kalo sudah setting path kita mengizinkan windows untuk mengintip folder bin secara otomatis,jadi cukup ketik ``` javac ``` doang udah bisa

### 2. Jelaskan Kegunaan perintah javac ketika masuk di command prompt!
javac tuh singkatan dari java compiler,kegunaan nya tuh buat menerjemahkan bahasa codingan java yang kita tulis menjadi bytecode (bahasa yang mudah dipahami mesin komputer)
disini saya akan memberi contoh nya jika mau menjalankan nya dengan javac :
* pertama tama kita harus ke folder tempat dimana kita menyimpan file java nya,misal disini kan saya menyimpan nya kan di ``` Documents\coba java ```  seperti di gambar ini:
<img width="909" height="41" alt="image" src="https://github.com/user-attachments/assets/bc360989-eab9-433c-9251-7af8139a51e1" />

* lalu kita ketik di cmd ``` cd "Documents\coba java ``` untuk menyuruh cmd masuk ke folder tempat kita menyimpan file itu
* lalu saat posisi folder sudah pindah ke ``` C:\Users\VALENT\Documents\coba java> ```,kita ketik perintah compiler nya: ``` javac MyJavaKnowledge.java ```
<img width="935" height="323" alt="image" src="https://github.com/user-attachments/assets/d5cf9c85-a070-4e17-a818-e64e97dc213f" />

* nah disitu gak muncul apa2 karena file yang berisi perintah bahasa java itu sudah di compile ke bahasa yang bisa dipahami mesin ke bentuk file yang sudah dibuat otomoatis oleh javac berformat ``` class ```
<img width="575" height="131" alt="image" src="https://github.com/user-attachments/assets/00fa00cd-dc27-419e-8e67-db652f89fc92" />

* nah trs kita tinggal ketik aja ``` java (nama file) ```,contoh nya adalah seperti ini:
<img width="916" height="195" alt="image" src="https://github.com/user-attachments/assets/af61ee2c-4597-4842-af17-25fd0119885f" />

### (bonus) perbedaan file class dan file java
* file java : ini adalah file teks berisi bahasa java yang bisa dipahami oleh manusia
* file class : ini disebut file "Bytecode" yang berisi bahasa yang hanya dipahami oleh JVM (Java virtual Machine) yang sudah kita install

### 3. apa perbedaan ``` System.out.print ``` dan ``` System.out.println ``` ?
* fungsi print tuh ya ngeprint teks nya,cuman setelah kita print lalu kita enter dan tulis perintah print lagi ya teks nya gak akan pindah baris (enter)
* nah fungsi tambahan "ln" ini tuh biar kita bisa nambah baris baru







