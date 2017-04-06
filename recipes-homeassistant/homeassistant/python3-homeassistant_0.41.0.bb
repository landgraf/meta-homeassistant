SUMMARY = "Open-source home automation platform running on Python 3"
HOMEPAGE = "https://home-assistant.io/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f4eda51018051de136d3b3742e9a7a40"

HOMEASSISTANT_CONFIG_DIR ?= "${localstatedir}/lib/homeassistant"
HOMEASSISTANT_CONFIG_DIR[doc] = "Configuration directory used by home-assistant."
HOMEASSISTANT_USER ?= "homeassistant"
HOMEASSISTANT_USER[doc] = "User the home-assistent service runs as."

inherit setuptools3 useradd update-rc.d systemd

inherit pypi
SRC_URI[md5sum] = "861e403c1da3048657e3a351d60e4783"
SRC_URI[sha256sum] = "51b8e77577dfa55837c66cfc918b030d9f51d3894f6987be4d3506e6c6199dae"

SRC_URI += "\
    file://homeassistant.service \
    file://homeassistant.init \
    file://0001-remove-typing-it-is-already-included-in-python-3.5.patch \
    "

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "homeassistant"
USERADD_PARAM_${PN} = "--system --home ${HOMEASSISTANT_CONFIG_DIR} \
                       --no-create-home --shell /bin/false \
                       --groups homeassistant,dialout --gid homeassistant ${HOMEASSISTANT_USER}"

INITSCRIPT_NAME = "homeassistant"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "homeassistant.service"

do_install_append () {
    install -d -o ${HOMEASSISTANT_USER} -g homeassistant ${D}${HOMEASSISTANT_CONFIG_DIR}

    # Install init scripts and set correct config directory
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/homeassistant.init  ${D}${sysconfdir}/init.d/homeassistant
    sed -i -e 's,@HOMEASSISTANT_CONFIG_DIR@,${HOMEASSISTANT_CONFIG_DIR},g'  ${D}${sysconfdir}/init.d/homeassistant
    sed -i -e 's,@HOMEASSISTANT_USER@,${HOMEASSISTANT_USER},g'  ${D}${sysconfdir}/init.d/homeassistant

    # Install systemd unit files and set correct config directory
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/homeassistant.service ${D}${systemd_unitdir}/system
    sed -i -e 's,@HOMEASSISTANT_CONFIG_DIR@,${HOMEASSISTANT_CONFIG_DIR},g' ${D}${systemd_unitdir}/system/homeassistant.service
    sed -i -e 's,@HOMEASSISTANT_USER@,${HOMEASSISTANT_USER},g' ${D}${systemd_unitdir}/system/homeassistant.service
}

# Home Assistant core
RDEPENDS_${PN} = " \
    python3-requests  \
    python3-pyyaml   \
    python3-pytz  \
    python3-pip \
    python3-jinja2  \
    python3-voluptuous  \
    python3-typing  \
    python3-aiohttp \
    python3-async-timeout  \
    \
    python3-asyncio \
    python3-multiprocessing \
    python3-sqlite3 \
    python3-html \
    "


# homeassistant.components.http
RDEPENDS_${PN} += " \
    python3-aiohttp-cors  \
    "

# homeassistant.components.recorder
# homeassistant.scripts.db_migrator
RDEPENDS_${PN} += " \
    python3-sqlalchemy  \
    "

# homeassistant.components.discovery
RDEPENDS_${PN} += " \
    python3-netdisco  \
    "

# homeassistant.components.sun
RDEPENDS_${PN} += " \
    python3-astral  \
    "

# homeassistant.components.sensor.swiss_hydrological_data
# homeassistant.components.sensor.ted5000
# homeassistant.components.sensor.yr
RDEPENDS_${PN} += " \
    python3-xmltodict \
    "

# homeassistant.components.updater
RDEPENDS_${PN} += " \
    python3-distro  \
    "

# homeassistant.components.conversation
RDEPENDS_${PN} += " \
    python3-fuzzywuzzy  \
    "

# homeassistant.components.tts.google
RDEPENDS_${PN} += " \
    python3-gtts-token  \
    "

# homeassistant.components.google
RDEPENDS_${PN} += " \
    python3-oauth2client \
    "

# homeassistant.components.google
RDEPENDS_${PN} += " \
    python3-google-api-python-client  \
    "

# homeassistant.components.light.hue
RDEPENDS_${PN} += " \
    python3-phue  \
    "

# homeassistant.components.hdmi_cec
#RDEPENDS_${PN} += " \
#    python3-pycec  \
#    "

# homeassistant.components.knx
RDEPENDS_${PN} += " \
    python3-knxip  \
    "

# homeassistant.components.netatmo
RDEPENDS_${PN} += " \
    python3-lnetatmo \
    "

# homeassistant.components.mystrom
RDEPENDS_${PN} += " \
    python3-mystrom \
    "

# homeassistant.scripts.check_config
RDEPENDS_${PN} += " \
    python3-colorlog  \
    "

# homeassistant.components.lifx
RDEPENDS_${PN} += " \
    python3-liffylights \
    "
# homeassistant.components.mqtt
RDEPENDS_${PN} += " \
    python3-paho-mqtt \
    "

# homeassistant.components.mqtt.server
RDEPENDS_${PN} += " \
    python3-hbmqtt \
    "

# homeassistant.components.media_player.sonos
RDEPENDS_${PN} += " \
    python3-soco \
    "
