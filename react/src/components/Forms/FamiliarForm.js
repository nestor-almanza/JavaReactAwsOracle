import React, {Fragment} from 'react';
import { useForm } from 'react-hook-form';


export const FamiliarForm = () =>{

    const { register, handleSubmit,  formState: { errors } } = useForm();

    const onSubmit = ( data, event) =>{
        console.log(data);
        event.target.reset();
    }

    return(
        <Fragment>
            <h2>
                formulario
            </h2>

            <form onSubmit={handleSubmit(onSubmit)}>
                <input 
                    
                    className="form-control my-2"
                    {...register("titulo", { required: true })}
                    
                />
                <span className="text-danger text-small d-block mb-2">
                    {errors.titulo?.type === 'required' && "Titulo is required"}
                </span>
                
                {/**
                 * 
                    name='titulo'
                    defaultValue='test'
                    className="form-control my-2"
                    {...register('test', { required: true })}
                    
                    <span className="text-danger text-small d-block mb-2">
                    { errors?.titulo?.message}
                    </span>
                 */}
                

                <button className="btn btn-primary"> Enviar </button>
              
            </form>

        </Fragment>
    )
}