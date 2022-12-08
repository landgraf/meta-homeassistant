LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pypi setuptools3

SRC_URI[md5sum] = "fce49db800fa7d17786346aba083e2b7"
SRC_URI[sha256sum] = "38f47bed399967329d06a784081b427e94a5055ad7487875fb8af8b58d4db611"

RDEPENDS:${PN} = "\
	${PYTHON_PN}-aiohttp (>=3.0.0) \
"
