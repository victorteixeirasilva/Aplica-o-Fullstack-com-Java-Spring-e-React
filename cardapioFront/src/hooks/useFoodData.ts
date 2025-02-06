import axios, { AxiosPromise } from "axios";
import { FoodData } from "../interface/FoodData";
import { useQuery } from "@tanstack/react-query";

const API_URL = "http://localhost:8080";

const fetchData = async (): AxiosPromise<FoodData[]> => {
  const response = await axios.get(API_URL + "/food"); // Adicione 'await'
  return response;
};

export function useFoodData() {
  const { data, isLoading, error, ...rest } = useQuery({ // Spread operator para outras propriedades
    queryFn: fetchData,
    queryKey: ['food-data'],
    retry: 2,
  });

  return {
    data: data?.data, // Acesse data.data para obter os dados da API
    isLoading,
    error,
    ...rest // Retorne outras propriedades importantes (refetch, etc.)
  };
}