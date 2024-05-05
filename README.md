<h2> Xây dựng ứng dụng quản lý thói quen trên nền tảng di động </h2>

### I. Giới thiệu chung:

> Mục tiêu của đề tài "Xây dựng ứng dụng quản lý thói quen" là tạo ra một ứng dụng giúp người dùng xây dựng và duy trì các thói quen tích cực trong cuộc sống hàng ngày. Đây là một ứng dụng sử dụng nền tảng Android, nhằm cung cấp cho người dùng một công cụ ghi nhớ, theo dõi các thói quen của mình, ngoài ra còn nhắc nhở khi đến lịch thực hiện, thống kê và đánh giá tiến độ của người tiêu dùng

### II. Phân tích thiết kế:

#### 2.1. Sơ đồ use case:

![Alt text](./app/src/main/res/drawable/usecase_one.png?raw=true)

#### 2.2. Cấu trúc Database:

<details>
  <summary>Click để xem</summary>

```json
{
  "Habit_Tracker": {
    "Du_Lieu": {
      "User001": {
        "ThoiQuen001": {
          "DonVi": "km",
          "DonViTang": 0.1,
          "KhoangThoiGian": "Week",
          "LoiNhacNho": "Chạy thôi, chạy thoi",
          "MoTa": "Chạy bộ đi nào",
          "MucTieu": 12,
          "Ten": "Chạy bộ",
          "ThoiDiem": "Evening",
          "ThoiGianBatDau": "06-03-2024",
          "ThoiGianKetThuc": "13-04-2024",
          "ThoiGianNhacNho": "4:44PM",
          "ThoiGianThucHien": {
            "02-04-2024 2:00:04PM": 0.1,
            "02-04-2024 2:35:23PM": 0.1,
            "03-04-2024 12:30:24PM": 0.1,
            "03-04-2024 12:30:25PM": 0.1,
            "03-04-2024 12:30:26PM": 0.1,
            "03-04-2024 12:30:27PM": 0.1,
            "03-04-2024 12:30:28PM": 0.1,
            "03-04-2024 12:30:29PM": 0.1,
            "03-04-2024 12:30:30PM": 0.1,
            "03-04-2024 12:30:31PM": 0.1,
            "03-04-2024 12:30:32PM": 0.1,
            "03-04-2024 12:30:33PM": 0.1,
            "03-04-2024 1:25:28PM": 0.1,
            "03-04-2024 1:25:30PM": -0.1,
            "03-04-2024 1:30:29PM": -0.1,
            "03-04-2024 1:30:30PM": -0.1,
            "03-04-2024 1:30:31PM": -0.1,
            "03-04-2024 1:30:32PM": -0.1,
            "03-04-2024 2:05:15AM": 0.1,
            "03-04-2024 2:19:27AM": 0.1,
            "04-04-2024 2:51:47PM": 0.1,
            "04-04-2024 2:51:48PM": 0.1,
            "04-04-2024 2:51:49PM": 0.1,
            "04-04-2024 2:51:50PM": 0.1,
            "04-04-2024 2:51:51PM": 0.1,
            "04-04-2024 2:51:52PM": 0.1,
            "04-04-2024 2:51:53PM": 0.1,
            "04-04-2024 2:51:54PM": 0.1,
            "04-04-2024 2:51:55PM": 0.1,
            "04-04-2024 2:51:56PM": 0.1,
            "04-04-2024 2:59:14PM": 0.1,
            "04-04-2024 2:59:20PM": -0.1,
            "04-04-2024 2:59:21PM": -0.1,
            "04-04-2024 2:59:22PM": -0.1,
            "04-04-2024 3:20:06PM": -0.1,
            "04-04-2024 3:20:07PM": -0.1,
            "04-04-2024 3:20:08PM": -0.1,
            "04-04-2024 3:20:09PM": -0.1,
            "04-04-2024 3:20:10PM": -0.1,
            "04-04-2024 3:20:11PM": -0.1,
            "04-04-2024 3:20:12PM": -0.1,
            "04-04-2024 3:20:13PM": -0.1,
            "04-04-2024 3:20:14PM": -0.1,
            "04-04-2024 3:20:15PM": -0.1,
            "04-04-2024 3:20:16PM": -0.1,
            "04-04-2024 3:20:17PM": -0.1,
            "04-04-2024 3:20:18PM": -0.1,
            "05-04-2024 12:16:25AM": 0.1,
            "05-04-2024 12:17:33AM": 0.1,
            "05-04-2024 12:17:34AM": 0.1,
            "05-04-2024 12:17:35AM": 0.1,
            "05-04-2024 12:17:36AM": 0.1,
            "05-04-2024 12:17:37AM": 0.1,
            "05-04-2024 12:17:38AM": 0.1,
            "05-04-2024 12:18:50AM": 0.1,
            "05-04-2024 12:18:52AM": 0.1,
            "05-04-2024 12:18:53AM": 0.1,
            "05-04-2024 12:18:55AM": 0.1,
            "05-04-2024 12:18:56AM": 0.1,
            "05-04-2024 12:18:58AM": 0.1,
            "05-04-2024 12:18:59AM": 0.1,
            "05-04-2024 12:19:01AM": 0.1,
            "05-04-2024 1:01:51AM": 0.1,
            "05-04-2024 1:06:20AM": 0.1,
            "05-04-2024 1:06:21AM": -0.1,
            "05-04-2024 1:13:15AM": 0.1
          },
          "TrangThai": "Đang thực hiện"
        },
        "ThoiQuen002": {
          "DonVi": "hours",
          "DonViTang": 0.5,
          "KhoangThoiGian": "Day",
          "LoiNhacNho": "Tranh thủ học Toeic nào, sắp thi rồi",
          "MauSac": "#187BCE",
          "MoTa": "Luyện thi TOEIC",
          "MucTieu": 2,
          "Ten": "Học anh văn",
          "ThoiDiem": "Anytime",
          "ThoiGianBatDau": "06-03-2024",
          "ThoiGianKetThuc": "15-04-2024",
          "ThoiGianNhacNho": "4:46PM",
          "ThoiGianThucHien": {
            "02-04-2024 12:34:20AM": 0.5,
            "03-04-2024 10:41:45AM": 0.5,
            "03-04-2024 10:41:49AM": 0.5,
            "04-04-2024 2:46:04PM": 0.5,
            "04-04-2024 2:46:05PM": 0.5,
            "04-04-2024 2:52:42PM": 0.5,
            "04-04-2024 2:52:43PM": -0.5,
            "04-04-2024 2:58:29PM": -0.5,
            "04-04-2024 2:58:31PM": -0.5,
            "04-04-2024 2:58:33PM": -0.5,
            "04-04-2024 2:58:51PM": 0.5,
            "04-04-2024 2:58:59PM": 0.5,
            "04-04-2024 2:59:24PM": -0.5,
            "04-04-2024 2:59:25PM": -0.5,
            "04-04-2024 2:59:26PM": -0.5,
            "04-04-2024 3:19:34PM": 0.5,
            "04-04-2024 3:19:36PM": -0.5,
            "04-04-2024 3:19:37PM": -0.5,
            "04-04-2024 3:20:35PM": -0.5,
            "04-04-2024 3:22:33PM": -0.5,
            "05-04-2024 12:18:49AM": 0.5,
            "05-04-2024 12:46:38AM": -0.5,
            "05-04-2024 12:46:39AM": 0.5,
            "05-04-2024 12:46:40AM": 0.5,
            "18-03-2024 4:07:02PM": 1,
            "19-03-2024 4:07:02PM": 0.5,
            "19-03-2024 4:07:13PM": 0.5,
            "20-03-2024 10:12:59AM": -0.5,
            "20-03-2024 10:13:01AM": -0.5,
            "20-03-2024 10:13:02AM": 0.5,
            "20-03-2024 10:13:03AM": 0.5,
            "20-03-2024 10:13:05AM": 0.5,
            "20-03-2024 10:13:08AM": 0.5,
            "20-03-2024 4:32:27AM": 0.5,
            "20-03-2024 4:32:32AM": 0.5,
            "22-03-2024 1:57:14AM": 0.5,
            "22-03-2024 1:57:17AM": -0.5,
            "27-03-2024 3:53:24AM": 0.5,
            "27-03-2024 3:53:25AM": -0.5,
            "27-03-2024 3:55:29AM": 0.5,
            "27-03-2024 3:57:18AM": -0.5,
            "27-03-2024 3:57:38AM": 0.5,
            "27-03-2024 3:58:38AM": 0.5,
            "27-03-2024 4:08:16AM": 0.5,
            "27-03-2024 4:14:15AM": -0.5,
            "27-03-2024 4:14:16AM": 0.5,
            "27-03-2024 4:14:17AM": -0.5,
            "27-03-2024 4:37:37PM": -0.5,
            "27-03-2024 9:26:02AM": 0.5,
            "27-03-2024 9:26:03AM": -0.5,
            "28-03-2024 12:08:48AM": 0.5,
            "28-03-2024 12:12:50AM": 0.5,
            "29-03-2024 8:26:58AM": 0.5,
            "29-03-2024 8:27:00AM": -0.5,
            "29-03-2024 9:07:30AM": 0.5,
            "29-03-2024 9:17:29AM": 0.5
          },
          "TrangThai": "Đã hoàn thành"
        },
        "ThoiQuen003": {
          "DonVi": "hours",
          "DonViTang": 0.5,
          "KhoangThoiGian": "Week",
          "LoiNhacNho": "Đi tập bóng rổ kìa, sắp thi đấu rồi. Cố gắng lên",
          "MauSac": "#000000",
          "MoTa": "Tập bóng rổ cho trận Derby Thủ Đức",
          "MucTieu": 7,
          "Ten": "Chơi bóng rổ",
          "ThoiDiem": "Evening",
          "ThoiGianBatDau": "01-03-2024",
          "ThoiGianKetThuc": "15-03-2024",
          "ThoiGianNhacNho": "10:52AM",
          "ThoiGianThucHien": {
            "02-04-2024 12:34:22AM": 1,
            "03-04-2024 1:24:54PM": -1,
            "03-04-2024 1:24:56PM": 1,
            "04-04-2024 2:52:33PM": 1,
            "04-04-2024 2:52:37PM": 1,
            "04-04-2024 2:52:39PM": -1,
            "04-04-2024 2:52:40PM": -1,
            "04-04-2024 2:52:41PM": 1,
            "04-04-2024 2:59:35PM": -1,
            "04-04-2024 2:59:40PM": -1,
            "04-04-2024 3:20:21PM": -1,
            "04-04-2024 3:20:22PM": -1,
            "04-04-2024 3:20:24PM": 1,
            "04-04-2024 3:20:25PM": 1,
            "04-04-2024 3:20:29PM": -1,
            "04-04-2024 3:22:08PM": 1,
            "04-04-2024 3:22:09PM": 1,
            "04-04-2024 3:22:15PM": -1,
            "05-04-2024 12:42:21AM": -1,
            "05-04-2024 12:42:24AM": 1,
            "05-04-2024 12:42:31AM": -1,
            "05-04-2024 12:42:36AM": 1,
            "05-04-2024 12:44:22AM": 0.5,
            "05-04-2024 12:44:23AM": 0.5,
            "18-03-2024 4:07:02PM": 1,
            "19-03-2024 3:37:20PM": -1,
            "19-03-2024 3:37:21PM": 1,
            "19-03-2024 3:42:35PM": -1,
            "19-03-2024 3:42:36PM": 1,
            "19-03-2024 8:58:50PM": 1,
            "20-03-2024 10:14:06AM": 1,
            "20-03-2024 10:14:07AM": -1,
            "27-03-2024 3:55:32AM": -1,
            "27-03-2024 4:37:41PM": -1,
            "27-03-2024 4:37:42PM": 1,
            "27-03-2024 4:37:43PM": 1,
            "27-03-2024 4:37:44PM": 1,
            "27-03-2024 4:37:45PM": -1,
            "27-03-2024 4:37:46PM": -1,
            "27-03-2024 9:25:58AM": 1,
            "27-03-2024 9:25:59AM": 1,
            "27-03-2024 9:26:00AM": -1,
            "28-03-2024 12:08:49AM": 1,
            "29-03-2024 10:12:34AM": 1,
            "29-03-2024 10:12:35AM": -1
          },
          "TrangThai": "Đang thực hiện"
        },
        "ThoiQuen004": {
          "DonVi": "pages",
          "DonViTang": 1,
          "KhoangThoiGian": "Month",
          "LoiNhacNho": "Đọc sách để phát triển bản thân",
          "MauSac": "#ECECEC",
          "MoTa": "Đọc Đắc Nhân Tâm",
          "MucTieu": 1000,
          "Ten": "Đọc sách",
          "ThoiDiem": "Morning",
          "ThoiGianBatDau": "10-03-2024",
          "ThoiGianKetThuc": "10-05-2024",
          "ThoiGianNhacNho": "1:34AM",
          "ThoiGianThucHien": {
            "02-04-2024 10:13:14PM": 1,
            "02-04-2024 10:13:15PM": 1,
            "02-04-2024 12:34:46AM": -1,
            "02-04-2024 12:34:47AM": 1,
            "02-04-2024 3:10:08PM": 1,
            "02-04-2024 3:10:10PM": 1,
            "02-04-2024 3:10:12PM": 1,
            "02-04-2024 3:10:14PM": 1,
            "02-04-2024 3:10:36PM": 1,
            "02-04-2024 3:10:39PM": 1,
            "03-04-2024 1:34:56PM": 1,
            "03-04-2024 1:34:58PM": 1,
            "03-04-2024 2:05:16AM": 1,
            "04-04-2024 9:55:26AM": 1,
            "04-04-2024 9:55:28AM": 1,
            "04-04-2024 9:55:29AM": 1,
            "04-04-2024 9:56:39AM": 1,
            "04-04-2024 9:56:40AM": 1,
            "04-04-2024 9:56:41AM": 1,
            "04-04-2024 9:56:42AM": 1,
            "04-04-2024 9:56:43AM": 1,
            "04-04-2024 9:56:44AM": 1,
            "04-04-2024 9:56:45AM": 1,
            "04-04-2024 9:56:46AM": 1,
            "04-04-2024 9:56:47AM": 1,
            "04-04-2024 9:56:48AM": 1,
            "04-04-2024 9:56:49AM": 1,
            "04-04-2024 9:56:50AM": 1,
            "04-04-2024 9:56:51AM": 1,
            "04-04-2024 9:56:52AM": 1,
            "05-04-2024 12:29:31AM": 1,
            "05-04-2024 1:00:19AM": 1,
            "05-04-2024 1:00:20AM": -1,
            "19-03-2024 3:37:23PM": 1,
            "19-03-2024 3:37:24PM": 1,
            "19-03-2024 3:37:25PM": 1,
            "19-03-2024 3:37:26PM": 1,
            "19-03-2024 3:37:27PM": 1,
            "19-03-2024 3:37:28PM": 1,
            "19-03-2024 3:37:29PM": 1,
            "19-03-2024 3:37:30PM": -1,
            "19-03-2024 3:49:45PM": -1,
            "19-03-2024 3:49:46PM": -1,
            "19-03-2024 3:49:49PM": -1,
            "19-03-2024 3:49:51PM": -1,
            "19-03-2024 3:49:52PM": -1,
            "19-03-2024 3:49:54PM": -1,
            "19-03-2024 3:49:56PM": 1,
            "19-03-2024 3:49:57PM": 1,
            "19-03-2024 3:49:58PM": 1,
            "19-03-2024 3:49:59PM": 1,
            "19-03-2024 3:50:01PM": 1,
            "19-03-2024 8:58:18PM": 2,
            "20-03-2024 10:14:08AM": 1,
            "20-03-2024 10:14:09AM": 1,
            "20-03-2024 10:14:18AM": 1,
            "20-03-2024 10:14:19AM": -1,
            "20-03-2024 10:14:20AM": 1,
            "20-03-2024 10:14:21AM": 1,
            "20-03-2024 10:14:22AM": 1,
            "20-03-2024 10:14:23AM": 1,
            "27-03-2024 9:26:08AM": 1,
            "28-03-2024 1:07:05PM": 1,
            "28-03-2024 1:07:07PM": 1,
            "28-03-2024 1:07:08PM": 1,
            "28-03-2024 1:07:10PM": 1,
            "28-03-2024 1:07:12PM": 1,
            "28-03-2024 1:07:14PM": 1,
            "28-03-2024 1:07:17PM": 1,
            "28-03-2024 2:14:15PM": -1,
            "28-03-2024 2:14:16PM": -1,
            "28-03-2024 3:03:39PM": 1,
            "28-03-2024 3:03:45PM": 1,
            "28-03-2024 3:03:57PM": -1
          },
          "TrangThai": "Đang thực hiện"
        },
        "ThoiQuen005": {
          "DonVi": "km",
          "DonViTang": 0.1,
          "KhoangThoiGian": "Week",
          "LoiNhacNho": "eerererer",
          "MoTa": "eerreer",
          "MucTieu": 3,
          "Ten": "Chay bo ne",
          "ThoiDiem": "Morning",
          "ThoiGianBatDau": "02-04-2024",
          "ThoiGianKetThuc": "09-04-2024",
          "ThoiGianNhacNho": "2:10PM",
          "ThoiGianThucHien": {
            "03-04-2024 1:24:37PM": 0.1,
            "03-04-2024 1:24:38PM": -0.1,
            "03-04-2024 1:24:39PM": -0.1,
            "03-04-2024 1:24:40PM": 0.1,
            "03-04-2024 1:24:41PM": 0.1,
            "03-04-2024 1:24:42PM": 0.1,
            "03-04-2024 1:24:44PM": 0.1,
            "03-04-2024 1:24:46PM": 0.1,
            "03-04-2024 1:24:48PM": -0.1,
            "03-04-2024 7:29:03AM": 0.1,
            "04-04-2024 10:53:22AM": 0.1,
            "04-04-2024 10:53:25AM": 0.1,
            "05-04-2024 12:30:12AM": 0.1,
            "05-04-2024 12:30:13AM": 0.1,
            "05-04-2024 12:30:14AM": 0.1,
            "05-04-2024 12:30:16AM": 0.1
          },
          "TrangThai": "Đang thực hiện"
        },
        "ThoiQuen006": {
          "DonVi": "pages",
          "DonViTang": 1,
          "KhoangThoiGian": "Week",
          "LoiNhacNho": "Chong chong tre ne nobita",
          "MoTa": "Doc truyen tranh doremon thoai",
          "MucTieu": 7,
          "Ten": "Doc sach ne",
          "ThoiDiem": "Morning",
          "ThoiGianBatDau": "02-04-2024",
          "ThoiGianKetThuc": "18-04-2024",
          "ThoiGianNhacNho": "7:11PM",
          "ThoiGianThucHien": {
            "03-04-2024 1:29:15PM": -1,
            "03-04-2024 1:29:16PM": 1,
            "03-04-2024 1:58:28AM": 1,
            "03-04-2024 1:58:29AM": -1,
            "03-04-2024 2:05:17AM": 1,
            "03-04-2024 7:28:58AM": 1,
            "03-04-2024 7:29:00AM": -1,
            "05-04-2024 12:23:44AM": 1,
            "05-04-2024 12:23:45AM": -1,
            "05-04-2024 12:42:11AM": 1,
            "05-04-2024 1:19:36AM": 1,
            "05-04-2024 1:19:40AM": -1
          },
          "TrangThai": "Đang thực hiện"
        },
        "ThoiQuen007": {
          "DonVi": "hours",
          "DonViTang": 0.5,
          "KhoangThoiGian": "Day",
          "LoiNhacNho": "Code đi",
          "MoTa": "Làm bai tap",
          "MucTieu": 3,
          "Ten": "Coding",
          "ThoiDiem": "Anytime",
          "ThoiGianBatDau": "02-04-2024",
          "ThoiGianKetThuc": "02-04-2024",
          "ThoiGianNhacNho": "2:48PM",
          "ThoiGianThucHien": {
            "02-04-2024 2:49:08PM": 0.5,
            "02-04-2024 2:49:15PM": 0.5,
            "02-04-2024 2:49:18PM": 0.5,
            "02-04-2024 2:49:20PM": 0.5,
            "02-04-2024 2:49:22PM": 0.5,
            "02-04-2024 2:49:25PM": 0.5,
            "02-04-2024 2:49:33PM": -0.5,
            "02-04-2024 2:56:39PM": -0.5,
            "02-04-2024 2:56:41PM": 0.5,
            "02-04-2024 2:56:43PM": 0.5,
            "02-04-2024 2:56:46PM": -0.5,
            "02-04-2024 2:57:09PM": 0.5,
            "02-04-2024 2:57:12PM": -0.5,
            "02-04-2024 2:57:27PM": 0.5,
            "03-04-2024 1:22:43PM": -0.5,
            "03-04-2024 1:22:48PM": 0.5,
            "03-04-2024 1:23:43PM": -0.5,
            "03-04-2024 1:23:46PM": 0.5,
            "03-04-2024 1:23:48PM": 0.5,
            "03-04-2024 1:26:32PM": -0.5,
            "03-04-2024 1:26:41PM": -0.5,
            "03-04-2024 1:26:43PM": -0.5,
            "03-04-2024 1:26:47PM": 0.5,
            "03-04-2024 1:26:49PM": 0.5,
            "03-04-2024 1:58:18AM": -0.5,
            "03-04-2024 7:17:56AM": 0.5,
            "05-04-2024 12:30:09AM": -0.5,
            "05-04-2024 12:45:05AM": 0.5,
            "05-04-2024 12:45:36AM": -0.5,
            "05-04-2024 12:45:40AM": 0.5,
            "05-04-2024 12:45:42AM": -0.5,
            "05-04-2024 12:46:47AM": 0.5,
            "05-04-2024 12:47:26AM": -0.5,
            "05-04-2024 12:47:29AM": 0.5
          },
          "TrangThai": "Đã hoàn thành"
        },
        "ThoiQuen008": {
          "DonVi": "km",
          "DonViTang": 0.1,
          "KhoangThoiGian": "Month",
          "LoiNhacNho": "alo",
          "MoTa": "alo",
          "MucTieu": 3.1,
          "Ten": "Test",
          "ThoiDiem": "Evening",
          "ThoiGianBatDau": "22-03-2024",
          "ThoiGianKetThuc": "30-04-2024",
          "ThoiGianNhacNho": "3:05PM",
          "ThoiGianThucHien": {
            "02-04-2024 3:09:51PM": 0.1,
            "02-04-2024 3:09:52PM": -0.1,
            "03-04-2024 1:22:40PM": -0.1,
            "03-04-2024 1:22:42PM": 0.1,
            "03-04-2024 1:24:29PM": 0.1,
            "03-04-2024 1:24:31PM": -0.1,
            "03-04-2024 1:24:32PM": -0.1,
            "03-04-2024 1:24:34PM": 0.1,
            "03-04-2024 1:29:06PM": -0.1,
            "03-04-2024 1:29:08PM": 0.1,
            "03-04-2024 1:58:14AM": 0.1,
            "03-04-2024 1:58:15AM": -0.1,
            "03-04-2024 1:58:32AM": -0.1,
            "03-04-2024 1:58:35AM": 0.1,
            "03-04-2024 7:21:00AM": 0.1,
            "03-04-2024 7:21:01AM": 0.1,
            "03-04-2024 7:21:02AM": 0.1,
            "03-04-2024 7:21:04AM": 0.1,
            "03-04-2024 7:21:05AM": 0.1,
            "03-04-2024 7:21:06AM": 0.1,
            "03-04-2024 7:21:15AM": -0.1,
            "03-04-2024 7:21:16AM": -0.1,
            "03-04-2024 7:21:17AM": -0.1,
            "03-04-2024 7:21:18AM": -0.1,
            "03-04-2024 7:21:19AM": -0.1,
            "05-04-2024 12:15:36AM": -0.1,
            "05-04-2024 12:15:37AM": 0.1,
            "05-04-2024 12:15:39AM": 0.1,
            "05-04-2024 12:15:40AM": -0.1,
            "05-04-2024 12:23:47AM": 0.1,
            "05-04-2024 12:29:57AM": -0.1,
            "05-04-2024 12:29:59AM": 0.1,
            "05-04-2024 12:42:07AM": -0.1,
            "05-04-2024 12:42:08AM": 0.1,
            "05-04-2024 1:02:05AM": -0.1,
            "05-04-2024 1:11:17AM": 0.1,
            "05-04-2024 1:11:21AM": -0.1
          },
          "TrangThai": "Đang thực hiện"
        }
      }
    },
    "Tai_Khoan": {
      "User001": {
        "avatar": "https://th.bing.com/th/id/R.0d00b09021e70bf8d815d99b33a9ed58?rik=vnaHR3Kq6Nm4tA&riu=http%3a%2f%2fgetdrawings.com%2fcliparts%2fdeadpool-clipart-24.jpg&ehk=ckD8quXE7ZxNYM5G2a%2fSjJEus9n1J2qvv5Ru6A280l8%3d&risl=&pid=ImgRaw&r=0",
        "born": "05-01-2024",
        "gmail": "21110741@student.hcmute.edu.vn",
        "name": "Đặng Quang Trường ",
        "password": "1",
        "phone": "0909090940",
        "sex": "Nam",
        "username": "truongdang"
      },
      "User002": {
        "avatar": "https://img.freepik.com/free-psd/3d-illustration-person-with-sunglasses_23-2149436188.jpg?w=1380&t=st=1710666815~exp=1710667415~hmac=8310b40214501960fa50ce9c3e26a3e3f58e1eac65d592f5235ec1b744b92044",
        "born": "03-03-2003",
        "gmail": "21110741@student.hcmute.edu.vn",
        "name": "Nguyen Bao Quoc",
        "password": "quocne",
        "phone": "0795165330",
        "sex": "Nam",
        "username": "quocne"
      }
    }
  }
}
```

</details>

#### 2.3. Sơ đồ màn hình:

![Alt text](./app/src/main/res/drawable/so_do.png?raw=true)

#### 2.4. Các công cụ sử dụng:

- Thiết kế sơ đồ use case: draw.io
- Thiết kế database: Firebase
- Thiết kế giao diện: Figma, Canva
- Ngôn ngữ backend: java
- Môi trường lập trình (IDE): Android studio
- Lưu trữ và xây dựng project: Github

### III. Giao diện ứng dụng:

#### 3.1. Giao diện welcome:

![Alt text](./app/src/main/res/drawable/wel.png?raw=true)

#### 3.2. Giao diện đăng kí:

![Alt text](./app/src/main/res/drawable/dang_ki.png?raw=true)

#### 3.3. Giao diện quên mật khẩu:

![Alt text](./app/src/main/res/drawable/quen_pass.png?raw=true)

#### 3.4. Giao diện Home:

![Alt text](./app/src/main/res/drawable/home.png?raw=true)

#### 3.5. Giao diện Progress tổng quan:

![Alt text](./app/src/main/res/drawable/progress_total.png?raw=true)

#### 3.6. Giao diện Progress chi tiết:

![Alt text](./app/src/main/res/drawable/progress_1.png?raw=true)
![Alt text](./app/src/main/res/drawable/progress_2.png?raw=true)
![Alt text](./app/src/main/res/drawable/progress_3.png?raw=true)

#### 3.7. Giao diện Music:

![Alt text](./app/src/main/res/drawable/music.png?raw=true)

#### 3.8. Giao diện Pomodoro:

![Alt text](./app/src/main/res/drawable/pomo.png?raw=true)

#### 3.9. Giao diện Setting:

![Alt text](./app/src/main/res/drawable/set.png?raw=true)

### IV. Video demo:

[![Watch the video](./app/src/main/res/drawable/nhom2.png)](https://youtu.be/zMvxbD33Nzo)

### V. Các kết quả đạt được:

- Tìm hiểu được hoạt động của một ứng dụng Android
- Thiết kế giao diện và trải nghiệm người dùng
- Chức năng tao thói quen
- Quản lý thông tin thói quen
- Thống kê các thói quen

### VI. Hướng phát triển:

- Trong tương lai project sẽ được tìm hiểu kĩ hơn, và đi sâu vào các chắc năng để nâng cấp ứng dụng.
- Cụ thể cải thiện giao diện thân thiện với người dùng hơn, thêm các chức năng mới như kết nối giữa các người dùng, tạo sân chơi cho mọi người có thể chia sẻ các thói quen, một số chức năng cài đặt về màu sắc,…