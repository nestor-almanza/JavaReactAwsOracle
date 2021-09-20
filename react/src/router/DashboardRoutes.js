import React from "react";
import { Navbar } from "../components/ui/Navbar";
import {
    Switch,
    Route,
    Redirect
} from "react-router-dom";
import { DoctorScreen } from "../components/doctor/DoctorScreen";
import { FamiliarScreen } from "../components/familiar/FamiliarScreen";
import { Especialidad } from "../components/ui/Especialidad";
import { Paciente } from "../components/paciente/Paciente";

export const DashboardRoutes = () => {
    return(
        <>
            <Navbar />

            <div>
                <Switch>
                    <Route exact path="/doctor" component={ DoctorScreen }/>
                    <Route exact path="/familiar" component={ FamiliarScreen }/>
                    <Route exact path="/especialidad" component={Especialidad}/>
                    <Route exact path="/paciente" component={ Paciente }/>

                    <Redirect to="/paciente"/>
                </Switch>
            </div>
        </>
    )
}