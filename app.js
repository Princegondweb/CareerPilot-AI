async function analyzeCareer() {

    const education =
        document.getElementById("education").value;

    const skills =
        document.getElementById("skills")
            .value
            .split(",");

    const role =
        document.getElementById("role").value;

    const response = await fetch(
        "/career/analyze",
        {
            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify({
                education: education,
                skills: skills,
                targetRole: role
            })
        }
    );

    const data = await response.json();

    document.getElementById("result").innerHTML = `

        <div class="card shadow p-4">

           <h3>
    Readiness Score:
    ${data.readinessScore}%
</h3>
<div class="progress mb-3">

    <div
        class="progress-bar"
        role="progressbar"
        style="width: ${data.readinessScore}%">

        ${data.readinessScore}%

    </div>

</div>

<h4>
    Level:
    <span class="badge bg-success">
    ${data.jobLevel}
</span>
</h4>

<p>
    ${data.careerAdvice}
</p>
            <h5 class="mt-3">
                Missing Skills
            </h5>

            <ul>
                ${data.missingSkills
                    .map(skill =>
                        `<li>${skill}</li>`)
                    .join("")}
            </ul>

            <h5>
                Roadmap
            </h5>

            <ul>
                ${data.roadmap
                    .map(item =>
                        `<li>${item}</li>`)
                    .join("")}
            </ul>

            <h5>
                Projects
            </h5>

            <ul>
                ${data.projects
                    .map(project =>
                        `<li>${project}</li>`)
                    .join("")}
            </ul>

            <h5>
    Interview Questions
</h5>

<ul>
    ${data.interviewQuestions
        .map(question =>
            `<li>${question}</li>`)
        .join("")}
</ul>

        </div>
    `;
}