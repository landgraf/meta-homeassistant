LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pypi setuptools3

SRC_URI[md5sum] = "5280bf6ffcc20547ca18acb9ecaf0771"
SRC_URI[sha256sum] = "4ad609039b206399c9c44ef2131c78580a0077499f94e9b1b3aa80b03dd67f83"

RDEPENDS:${PN} = "\
	${PYTHON_PN}-websocket-client (>=0.56.0) \
	${PYTHON_PN}-six (>=1.14.0) \
"
