LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98ceae65d56131ed6c7782a772389c12"

inherit pypi python_flit_core

SRC_URI[md5sum] = "72fe86b732e00a43610f1c3ba19527ea"
SRC_URI[sha256sum] = "89ff72bd5259643c1544bf76f8974e68f2480d89d81ddd3e3f890e4a0b309e2e"
DEPENDS += "python3-setuptools-native python3-wheel-native python3-flit-scm-native"

