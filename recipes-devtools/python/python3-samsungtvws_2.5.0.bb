LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6171ad1c765e7729c02f253ef06ef469"

inherit pypi setuptools3

SRC_URI[md5sum] = "d8380dc20486a6207e2345da3aafc885"
SRC_URI[sha256sum] = "00508dd5bf34199db8837a167b5aaa73bdb2590cb8fbfb28acbf33c0e60ceefa"

RDEPENDS:${PN} = "\
	${PYTHON_PN}-websocket-client (>=0.56.0) \
	${PYTHON_PN}-requests (>=2.21.0) \
"
