import axios, { AxiosPromise } from "axios";
import { FoodData } from "../interface/FoodData";
import { useMutation, useQueryClient } from "@tanstack/react-query";

const API_URL = "http://localhost:8080";

const postData = async (data: FoodData): AxiosPromise<any> => {
  const response = await axios.post(API_URL + "/food", data); // Adicione 'await'
  return response;
};

export function useFoodDataMutate() {
  const queryClient = useQueryClient();
  const mutate = useMutation({ // Spread operator para outras propriedades
    mutationFn: postData,
    retry: 2,
    onSuccess: () => {
        queryClient.invalidateQueries({ queryKey: ['food-data'] })
    }
  });

  return mutate;
}