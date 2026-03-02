![C41](https://github.com/user-attachments/assets/53f9bc6d-8866-4bb6-ae13-e5429acb79b3)
## Thread Group 1 – Basic Load

- Users: 10
- Ramp-up: 10s
- Loop: 5

Kết quả:
- Average Response Time: 75 ms
- Min Response Time: 28 ms
- Max Response Time: 534 ms
- Error Rate: 0%
- Throughput: 35 requests/hour

Nhận xét:
Với tải nhẹ (10 người dùng), hệ thống phản hồi nhanh và ổn định.
Không xuất hiện lỗi trong quá trình kiểm thử.
Thời gian phản hồi trung bình thấp cho thấy website hoạt động tốt trong điều kiện bình thường.
![C421](https://github.com/user-attachments/assets/06a3f642-41b4-41de-bca9-eb9495b54611)
![C42jpg](https://github.com/user-attachments/assets/69142442-2d23-4398-ac1c-f4ec8026f410)
## Thread Group 2 – Heavy Load

- Users: 50
- Ramp-up: 30s
- Loop: 3

Kết quả:
- Average Response Time: 75 ms
- Max Response Time: 534 ms
- Error Rate: 0%

- Throughput: 35 requests/hour


Nhận xét:
Hệ thống vẫn hoạt động ổn định khi tăng số lượng người dùng.
Không xảy ra lỗi trong quá trình kiểm thử.


![C43](https://github.com/user-attachments/assets/b603c970-6132-4c79-be88-cf8e897ca714)
![C431](https://github.com/user-attachments/assets/1d73b64c-4f23-4207-9df4-64a001cba5c6)
## Thread Group 3 – Custom 60s

- Users: 20
- Duration: 60 seconds

Kết quả:
- Average Response Time: 80 ms
- Min Response Time: 28 ms
- Max Response Time: 534 ms
- Error Rate: 0%
- Throughput: 37.4 requests/hour

Nhận xét:
Trong quá trình chạy liên tục 60 giây, hệ thống vẫn hoạt động ổn định.
Thời gian phản hồi tăng nhẹ so với tải nhẹ và tải nặng nhưng vẫn ở mức tốt.
Không xuất hiện lỗi, chứng tỏ hệ thống có khả năng chịu tải liên tục ổn định.


