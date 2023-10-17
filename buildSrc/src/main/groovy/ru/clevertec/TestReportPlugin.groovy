package ru.clevertec

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class TestReportPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        def map = [description: "Report task", group: "report", type: DefaultTask]
        project.task(map, "report_test") {
            doLast {
                File reportDir = project.file('reporttest')
                if (!reportDir.exists()) {
                    project.mkdir(reportDir)
                }
                for (Project subproject : project.subprojects) {
                    Collection<Project> allProjects = subproject.getAllprojects()
                    allProjects.each { pr ->
                        File testDir = pr.file('build/reports/tests')
                        if (testDir.exists()) {
                            File reportFile = project.file("reporttest/${pr.name}-test-report.txt")
                            reportFile.write("Tests for project ${pr.name} have been completed.\n")
                        }
                    }
                }
            }
        }
    }
}
