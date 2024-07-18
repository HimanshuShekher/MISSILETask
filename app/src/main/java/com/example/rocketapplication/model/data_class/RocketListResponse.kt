package com.example.rocketapplication.model.data_class


import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RocketListResponse : ArrayList<RocketListResponse.RocketListResponseItem>(){
    data class RocketListResponseItem(
        @SerializedName("crew")
        val crew: List<Any>,
        @SerializedName("details")
        val details: String, // Engine failure at 33 seconds and loss of vehicle
        @SerializedName("flight_number")
        val flightNumber: Int, // 1
        @SerializedName("is_tentative")
        val isTentative: Boolean, // false
        @SerializedName("last_date_update")
        val lastDateUpdate: String, // 2019-11-08T02:42:07.000Z
        @SerializedName("last_ll_launch_date")
        val lastLlLaunchDate: String, // 2019-11-30T00:00:00.000Z
        @SerializedName("last_ll_update")
        val lastLlUpdate: String, // 2019-10-24T21:57:16.000Z
        @SerializedName("last_wiki_launch_date")
        val lastWikiLaunchDate: String, // 2019-11-11T14:56:00.000Z
        @SerializedName("last_wiki_revision")
        val lastWikiRevision: String, // 5a43fcc5-01d1-11ea-9b27-0e1b4e421dcf
        @SerializedName("last_wiki_update")
        val lastWikiUpdate: String, // 2019-11-08T02:42:07.000Z
        @SerializedName("launch_date_local")
        val launchDateLocal: String, // 2006-03-25T10:30:00+12:00
        @SerializedName("launch_date_source")
        val launchDateSource: String, // wiki
        @SerializedName("launch_date_unix")
        val launchDateUnix: Int, // 1143239400
        @SerializedName("launch_date_utc")
        val launchDateUtc: String, // 2006-03-24T22:30:00.000Z
        @SerializedName("launch_failure_details")
        val launchFailureDetails: LaunchFailureDetails,
        @SerializedName("launch_site")
        val launchSite: LaunchSite,
        @SerializedName("launch_success")
        val launchSuccess: Boolean, // false
        @SerializedName("launch_window")
        val launchWindow: Int, // 0
        @SerializedName("launch_year")
        val launchYear: String, // 2006
        @SerializedName("links")
        val links: Links,
        @SerializedName("mission_id")
        val missionId: List<String>,
        @SerializedName("mission_name")
        val missionName: String, // FalconSat
        @SerializedName("rocket")
        val rocket: Rocket,
        @SerializedName("ships")
        val ships: List<String>,
        @SerializedName("static_fire_date_unix")
        val staticFireDateUnix: Int, // 1142553600
        @SerializedName("static_fire_date_utc")
        val staticFireDateUtc: String, // 2006-03-17T00:00:00.000Z
        @SerializedName("tbd")
        val tbd: Boolean, // false
        @SerializedName("telemetry")
        val telemetry: Telemetry,
        @SerializedName("tentative_max_precision")
        val tentativeMaxPrecision: String, // hour
        @SerializedName("timeline")
        val timeline: Timeline,
        @SerializedName("upcoming")
        val upcoming: Boolean // false
    ):Serializable {
        data class LaunchFailureDetails(
            @SerializedName("altitude")
            val altitude: Int, // 289
            @SerializedName("reason")
            val reason: String, // merlin engine failure
            @SerializedName("time")
            val time: Int // 33
        ):Serializable

        data class LaunchSite(
            @SerializedName("site_id")
            val siteId: String, // kwajalein_atoll
            @SerializedName("site_name")
            val siteName: String, // Kwajalein Atoll
            @SerializedName("site_name_long")
            val siteNameLong: String // Kwajalein Atoll Omelek Island
        ):Serializable

        data class Links(
            @SerializedName("article_link")
            val articleLink: String, // https://www.space.com/2196-spacex-inaugural-falcon-1-rocket-lost-launch.html
            @SerializedName("flickr_images")
            val flickrImages: List<String>,
            @SerializedName("mission_patch")
            val missionPatch: String, // https://images2.imgbox.com/40/e3/GypSkayF_o.png
            @SerializedName("mission_patch_small")
            val missionPatchSmall: String, // https://images2.imgbox.com/3c/0e/T8iJcSN3_o.png
            @SerializedName("presskit")
            val presskit: String, // http://www.spacex.com/press/2012/12/19/spacexs-falcon-1-successfully-delivers-razaksat-satellite-orbit
            @SerializedName("reddit_campaign")
            val redditCampaign: String, // https://www.reddit.com/r/spacex/comments/4gyh8z
            @SerializedName("reddit_launch")
            val redditLaunch: String, // https://www.reddit.com/r/space/comments/19gm5f/live_coverage_spacex_crs2_launch_to_the_iss/c8nvah4
            @SerializedName("reddit_media")
            val redditMedia: String, // https://www.reddit.com/r/spacex/comments/2xmumx
            @SerializedName("reddit_recovery")
            val redditRecovery: String, // https://www.reddit.com/r/spacex/comments/4ee2zy
            @SerializedName("video_link")
            val videoLink: String, // https://www.youtube.com/watch?v=0a_00nJ_Y88
            @SerializedName("wikipedia")
            val wikipedia: String, // https://en.wikipedia.org/wiki/DemoSat
            @SerializedName("youtube_id")
            val youtubeId: String // 0a_00nJ_Y88
        ):Serializable

        data class Rocket(
            @SerializedName("fairings")
            val fairings: Fairings,
            @SerializedName("first_stage")
            val firstStage: FirstStage,
            @SerializedName("rocket_id")
            val rocketId: String, // falcon1
            @SerializedName("rocket_name")
            val rocketName: String, // Falcon 1
            @SerializedName("rocket_type")
            val rocketType: String, // Merlin A
            @SerializedName("second_stage")
            val secondStage: SecondStage
        ):Serializable {
            data class Fairings(
                @SerializedName("recovered")
                val recovered: Boolean, // false
                @SerializedName("recovery_attempt")
                val recoveryAttempt: Boolean, // false
                @SerializedName("reused")
                val reused: Boolean, // false
                @SerializedName("ship")
                val ship: String // GOMSTREE
            ):Serializable

            data class FirstStage(
                @SerializedName("cores")
                val cores: List<Core>
            ):Serializable {
                data class Core(
                    @SerializedName("block")
                    val block: Int, // 1
                    @SerializedName("core_serial")
                    val coreSerial: String, // Merlin1A
                    @SerializedName("flight")
                    val flight: Int, // 1
                    @SerializedName("gridfins")
                    val gridfins: Boolean, // false
                    @SerializedName("land_success")
                    val landSuccess: Boolean, // false
                    @SerializedName("landing_intent")
                    val landingIntent: Boolean, // false
                    @SerializedName("landing_type")
                    val landingType: String, // Ocean
                    @SerializedName("landing_vehicle")
                    val landingVehicle: String, // JRTI-1
                    @SerializedName("legs")
                    val legs: Boolean, // false
                    @SerializedName("reused")
                    val reused: Boolean // false
                ):Serializable
            }

            data class SecondStage(
                @SerializedName("block")
                val block: Int, // 1
                @SerializedName("payloads")
                val payloads: List<Payload>
            ):Serializable {
                data class Payload(
                    @SerializedName("cap_serial")
                    val capSerial: String, // C101
                    @SerializedName("cargo_manifest")
                    val cargoManifest: String, // https://en.wikipedia.org/wiki/SpaceX_CRS-1#Payload
                    @SerializedName("customers")
                    val customers: List<String>,
                    @SerializedName("flight_time_sec")
                    val flightTimeSec: Int, // 11940
                    @SerializedName("manufacturer")
                    val manufacturer: String, // SSTL
                    @SerializedName("mass_returned_kg")
                    val massReturnedKg: Double, // 1859.7
                    @SerializedName("mass_returned_lbs")
                    val massReturnedLbs: Double, // 3747.9
                    @SerializedName("nationality")
                    val nationality: String, // United States
                    @SerializedName("norad_id")
                    val noradId: List<Int>,
                    @SerializedName("orbit")
                    val orbit: String, // LEO
                    @SerializedName("orbit_params")
                    val orbitParams: OrbitParams,
                    @SerializedName("payload_id")
                    val payloadId: String, // FalconSAT-2
                    @SerializedName("payload_mass_kg")
                    val payloadMassKg: Double, // 5383.85
                    @SerializedName("payload_mass_lbs")
                    val payloadMassLbs: Double, // 5460.9
                    @SerializedName("payload_type")
                    val payloadType: String, // Satellite
                    @SerializedName("reused")
                    val reused: Boolean, // false
                    @SerializedName("uid")
                    val uid: String // UerI6qmZTU2Fx2efDFm3QQ==
                ):Serializable {
                    data class OrbitParams(
                        @SerializedName("apoapsis_km")
                        val apoapsisKm: Double, // 622.56
                        @SerializedName("arg_of_pericenter")
                        val argOfPericenter: Double, // 85.029
                        @SerializedName("eccentricity")
                        val eccentricity: Double, // 0.0012404
                        @SerializedName("epoch")
                        val epoch: String, // 2020-12-21T02:41:06.000Z
                        @SerializedName("inclination_deg")
                        val inclinationDeg: Double, // 9.3453
                        @SerializedName("lifespan_years")
                        val lifespanYears: Double, // 0.00547945
                        @SerializedName("longitude")
                        val longitude: Double, // 78.5
                        @SerializedName("mean_anomaly")
                        val meanAnomaly: Double, // 275.1325
                        @SerializedName("mean_motion")
                        val meanMotion: Double, // 14.84904616
                        @SerializedName("periapsis_km")
                        val periapsisKm: Double, // 605.214
                        @SerializedName("period_min")
                        val periodMin: Double, // 96.975
                        @SerializedName("raan")
                        val raan: Double, // 236.9673
                        @SerializedName("reference_system")
                        val referenceSystem: String, // geocentric
                        @SerializedName("regime")
                        val regime: String, // low-earth
                        @SerializedName("semi_major_axis_km")
                        val semiMajorAxisKm: Double // 6992.022
                    ):Serializable
                }
            }
        }

        data class Telemetry(
            @SerializedName("flight_club")
            val flightClub: String // https://www.flightclub.io/results/?code=OG22
        ):Serializable

        data class Timeline(
            @SerializedName("beco")
            val beco: Int, // 149
            @SerializedName("center_core_boostback")
            val centerCoreBoostback: Int, // 204
            @SerializedName("center_core_entry_burn")
            val centerCoreEntryBurn: Int, // 407
            @SerializedName("center_core_landing")
            val centerCoreLanding: Int, // 499
            @SerializedName("center_stage_sep")
            val centerStageSep: Int, // 187
            @SerializedName("dragon_bay_door_deploy")
            val dragonBayDoorDeploy: Int, // 8808
            @SerializedName("dragon_separation")
            val dragonSeparation: Int, // 575
            @SerializedName("dragon_solar_deploy")
            val dragonSolarDeploy: Int, // 713
            @SerializedName("engine_chill")
            val engineChill: Int, // -420
            @SerializedName("fairing_deploy")
            val fairingDeploy: Int, // 217
            @SerializedName("first_stage_boostback_burn")
            val firstStageBoostbackBurn: Int, // 240
            @SerializedName("first_stage_entry_burn")
            val firstStageEntryBurn: Int, // 480
            @SerializedName("first_stage_landing")
            val firstStageLanding: Int, // 600
            @SerializedName("first_stage_landing_burn")
            val firstStageLandingBurn: Int, // 564
            @SerializedName("go_for_launch")
            val goForLaunch: Int, // -45
            @SerializedName("go_for_prop_loading")
            val goForPropLoading: Int, // -2280
            @SerializedName("ignition")
            val ignition: Int, // -3
            @SerializedName("liftoff")
            val liftoff: Int, // 0
            @SerializedName("maxq")
            val maxq: Int, // 76
            @SerializedName("meco")
            val meco: Int, // 174
            @SerializedName("payload_deploy")
            val payloadDeploy: Int, // 855
            @SerializedName("payload_deploy_1")
            val payloadDeploy1: Int, // 1800
            @SerializedName("payload_deploy_2")
            val payloadDeploy2: Int, // 2100
            @SerializedName("prelaunch_checks")
            val prelaunchChecks: Int, // -60
            @SerializedName("propellant_pressurization")
            val propellantPressurization: Int, // -60
            @SerializedName("rp1_loading")
            val rp1Loading: Int, // -2100
            @SerializedName("seco-1")
            val seco1: Int, // 476
            @SerializedName("seco-2")
            val seco2: Int, // 1680
            @SerializedName("seco-3")
            val seco3: Int, // 7684
            @SerializedName("seco-4")
            val seco4: Int, // 12483
            @SerializedName("second_stage_ignition")
            val secondStageIgnition: Int, // 179
            @SerializedName("second_stage_restart")
            val secondStageRestart: Int, // 1620
            @SerializedName("side_core_boostback")
            val sideCoreBoostback: Int, // 170
            @SerializedName("side_core_entry_burn")
            val sideCoreEntryBurn: Int, // 401
            @SerializedName("side_core_landing")
            val sideCoreLanding: Int, // 478
            @SerializedName("side_core_sep")
            val sideCoreSep: Int, // 153
            @SerializedName("stage1_lox_loading")
            val stage1LoxLoading: Int, // -2100
            @SerializedName("stage1_rp1_loading")
            val stage1Rp1Loading: Int, // -3000
            @SerializedName("stage2_lox_loading")
            val stage2LoxLoading: Int, // -960
            @SerializedName("stage2_rp1_loading")
            val stage2Rp1Loading: Int, // -2100
            @SerializedName("stage_sep")
            val stageSep: Int, // 176
            @SerializedName("webcast_launch")
            val webcastLaunch: Int, // 960
            @SerializedName("webcast_liftoff")
            val webcastLiftoff: Int // 54
        ):Serializable
    }
}