HOMEPAGE = "https://www.nabucasa.com/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pypi setuptools3

SRC_URI[md5sum] = "7c5dea602de4ea888c8fbe63adfc25cb"
SRC_URI[sha256sum] = "c9093ef803fc98737b95aee9a0bf74eedbecd74b9579567759faaddd165bdd92"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-warrant (>=0.6.1) \
    ${PYTHON_PN}-snitun (>=0.18) \
    ${PYTHON_PN}-acme (>=0.32.0) \
    ${PYTHON_PN}-cryptography (>=2.5) \
    ${PYTHON_PN}-attrs (>=18.2.0) \
    ${PYTHON_PN}-pytz \
"
