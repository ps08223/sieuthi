var images = [];
var current = 0;

function loadAnh() {
	document.getElementById("prev").style.visibility = "hidden";
	for (var i = 0; i < 6; i++) {
		images[i] = new Image();
		images[i].src = "img/sph" + (i+1) + ".jpg";
	}
}

function tiepTheo() {
	if (current < 5) {
		current++;
		document.getElementById("prev").style.visibility = "visible";
		if (current === 5) {
			document.getElementById("anh").src = images[current].src;
			document.getElementById("next").style.visibility = "hidden";
		} else {
			document.getElementById("anh").src = images[current].src;
		}
	}
}

function luiLai() {
	if (current > 0) {
		current--;
		document.getElementById("next").style.visibility = "visible";
		if (current === 0) {
			document.getElementById("anh").src = images[current].src;
			document.getElementById("prev").style.visibility = "hidden";
		} else {
			document.getElementById("anh").src = images[current].src;
		}
	}
}

function chuyenAnh() {
	current++;
	if (current === 6) {
		current = 0;
	}
	if (current === 5) {
		document.getElementById("anh").src = images[current].src;
		document.getElementById("next").style.visibility = "hidden";
	} else if (current === 0) {
		document.getElementById("anh").src = images[current].src;
		document.getElementById("prev").style.visibility = "hidden";
		document.getElementById("next").style.visibility = "visible";
	} else {
		document.getElementById("anh").src = images[current].src;
		document.getElementById("prev").style.visibility = "visible";
	}
}