
/** The following leaves out some details of the EM-SEII module in favor of comprehensibility */

let emseII = {
    name: "Ergänzungsmodul Engineering Software-Intensiver Systeme II",
    type: "Ergänzungsmodul",
    workload: 180,
    ects: 6,
    examination: "Written, 120 minutes",
    courses: [
        {
            type: "Lecture",
            presenceTime: 30,
            selfStudyTime: 60
        },
        {
            type: "Exercise",
            presenceTime: 30,
            selfStudyTime: 60
        }
    ],
    applicableStudyPrograms: [
        "M.Sc. Informatik",
        "M.Sc. Wirtschaftsinformatik",
        "M.Sc. Information Systems",
        "M.Sc. Mathematik",
    ],


    getECTS: function() {
        return this.ects
    },
    getEffort: function() {
        let result = "This lecture consists of ";

        for(let element of this.courses) {
            result += `\n${element.type}s with ${element.presenceTime}h of presence time and ${element.selfStudyTime}h of self-study time.`
        }

        return result
    },
    getApplicableStudyPrograms: function () {
        return `This module is applicable in the following study programs: ${this.applicableStudyPrograms.toString()}`
    }
}

let oose = {
    __proto__: emseII,
    name: "Object-Oriented Software Engineering",
    examination: "Written, 60 minutes",
    courses: [
        {
            type: "Lecture",
            presenceTime: 45,
            selfStudyTime: 90
        },
        {
            type: "Exercise",
            presenceTime: 15,
            selfStudyTime: 30
        }
    ],
    applicableStudyPrograms: [
        "M.Sc. Informatik"
    ]
}

let plp = {
    __proto__: emseII,
    name: "Programming Languages and Paradigms",
    examination: "Oral, 30 minutes",
    workload: 90,
    ects: 3,
    courses: [
        {
            type: "Lecture",
            presenceTime: 20,
            selfStudyTime: 40
        },
        {
            type: "Exercise",
            presenceTime: 10,
            selfStudyTime: 20
        }
    ],
    applicableStudyPrograms: [
        "M.Sc. Informatik",
        "B.Sc. Wirtschaftsinformatik"
    ]
}

/** main code */
console.log("OOSE: ")
console.log(oose.examination);
console.log(oose.getEffort());
console.log(oose.getECTS());
console.log(oose.getApplicableStudyPrograms());

console.log()

console.log("EMSE II: ")
console.log(emseII.getEffort());

console.log()

console.log("PLP: ")
console.log(plp.examination);
console.log(plp.getEffort());
console.log(plp.getECTS());
console.log(plp.getApplicableStudyPrograms());