function validateForm() {
			var ho = document.forms[0].ho.value;
			if (ho == "") {
				alert("Xin nhập họ!");
				return false;
			} else {
				var ten = document.forms[0].ten.value;
				if (ten == "") {
					alert("Xin nhập tên!");
					return false;
				} else {
					var chkgioiTinh = document.getElementsByName("gioiTinh");
					var cnt = 0;
					for (var i = 0; i < chkgioiTinh.length; i++) {
						if (chkgioiTinh[i].checked) {
							cnt++;
						}
					}
					if (cnt == 0) {
						alert("Xin chọn giới tính!");
						return false;
					} else {
						var diaChi = document.forms[0].diaChi.value;
						if (diaChi == "") {
							alert("Xin nhập địa chỉ!");
							return false;
						} else {
							var DT = document.forms[0].soDT.value;
							if (isNaN(DT)) {
								alert("Xin nhập điện thoại kiểu số!");
								return false;
							} else if (DT.trim().length != 11 && DT.trim().length != 10) {
								alert("Số điện thoại phải 10 hoặc 11 số!");
								return false;
							} else {
								alert("Chúc mừng! Bạn " + ho + " " + ten + " đã đặt hàng thành công!");
								return true;
							}
						}
					}
				}
			}
		}