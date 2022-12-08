SUMMARY = "YAML parser/emitter that supports roundtrip preservation of comments, seq/map flow style, and map key order"
HOMEPAGE = "https://bitbucket.org/ruamel/yaml"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=034154b7344d15438bc5ed5ee9cc075f"

PYPI_PACKAGE = "ruamel.yaml"

inherit pypi


do_install:prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}
