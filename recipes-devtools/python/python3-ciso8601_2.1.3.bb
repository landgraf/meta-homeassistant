HOMEPAGE = "python3-ciso8601"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pypi setuptools3

SRC_URI[md5sum] = "5d6434ad5ba5d54167aaa96b3503d81e"
SRC_URI[sha256sum] = "bdbb5b366058b1c87735603b23060962c439ac9be66f1ae91e8c7dbd7d59e262"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-pytz (>=2019.03) \
"
