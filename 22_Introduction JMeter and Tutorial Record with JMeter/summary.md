# (22) Fundamental Performance Test

## Resume 

Dalam Materi ini, mempelajari :
1. JMeter 
2. Components of JMeter Script
3. How To record with JMeter

### JMeter 
Apache JMeter adalah perangkat lunak open-source aplikasi dekstop java yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. JMeter banyak digunakan karena Open-Source dan mudah digunakan dengan GUI/non-GUI.

### Components of JMeter Script
1. Test Plan

Rencana besar tes yang akan dijalankan.

2. Thread Group

Kumpulan Thread yang menjalankan skenario yang sama.

3. Samplers

Sebutan untuk request yang dikirim ke server.

4. Config Elements

Elemen yang digunakan untuk konfigurasi sampler request.

5. Listeners

Perekam data yang dihasilkan dari tes

6. Timers

Fitur ini akan jalan duluan sebelum semua fitur lain berjalan.

7. Assertions

Kriteria tambahan apakah suatu assert pada API/Web/Testing pass atau tidak.

8. Pre-post processors

Fitur yang memroses response data sebelum/sesudah tes.

### How To record with JMeter
Langkah Penggunaan JMeter:
1. Select Template
2. Enable HTTP(S) Test Script Recorder
3. Start HTTP(S) Test Script Recorder
4. Set up Proxy on your Firefox Browser
5. Start Recording
6. Stop recording
7. Run the script


Pada Summary Report
``` 
Success rate = (jumlah_response_2xx/jumlah_thread)*100%
```



