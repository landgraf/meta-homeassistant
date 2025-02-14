SUMMARY = "JSON Web Token implementation in Python"
SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 32.\
 Original implementation was written by https://github.com/progrium"
HOMEPAGE = "http://github.com/jpadilla/pyjwt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68626705a7b513ca8d5f44a3e200ed0c"

SRC_URI[md5sum] = "a4712f980c008696e13e09504120b2a0"
SRC_URI[sha256sum] = "8d59a976fb773f3e6a39c85636357c4f0e242707394cadadd9814f5cbaa20e96"

PYPI_PACKAGE = "PyJWT"
inherit setuptools3 pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-cryptography (>= 1.4) \
"

BBCLASSEXTEND = "native nativesdk"
