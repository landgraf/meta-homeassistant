DESCRIPTION = "End-to-End encryption with SNI proxy on top of a TCP multiplexer."
HOMEPAGE = "https://github.com/NabuCasa/snitun"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-3.0-or-later;md5=1c76c4cc354acaac30ed4d5eefea7245"

inherit pypi setuptools3

SRC_URI[md5sum] = "fb7f29738c1535e21b3f1067bc5c77c2"
SRC_URI[sha256sum] = "c74f4ff82f8e106859652d0f7207e0533137742ab300693198909b37c097c27b"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-attrs (>=18.2.0) \
    ${PYTHON_PN}-async-timeout (>=3.0.1) \
    ${PYTHON_PN}-cryptography (>=2.5) \
"
